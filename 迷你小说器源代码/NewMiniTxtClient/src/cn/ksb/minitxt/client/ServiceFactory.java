package cn.ksb.minitxt.client;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ServiceFactory {
	private static final String path = Init
			.getProperty("client.config.service");
	private static Map<String, String> services = new HashMap<>();

	static {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		Document doc = null;

		try {
			db = dbf.newDocumentBuilder();
			doc = db.parse(new FileInputStream(path));
			NodeList serviceNodes = doc.getElementsByTagName("service");
			for (int i = 0; i < serviceNodes.getLength(); ++i) {
				Node node = serviceNodes.item(i);
				services.put(node.getAttributes().getNamedItem("key")
						.getNodeValue().trim(), node.getFirstChild()
						.getNodeValue().trim());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends Serializable> Service<T> getService(String key) {
		String classname = services.get(key);
		if (classname == null)
			throw new RuntimeException("无效的关键字");
		try {
			return (Service<T>) Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
