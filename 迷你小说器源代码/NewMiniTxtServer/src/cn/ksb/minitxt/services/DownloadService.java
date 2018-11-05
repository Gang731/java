package cn.ksb.minitxt.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import cn.ksb.minitxt.common.constants.NovelConstants;
import cn.ksb.minitxt.common.entity.DataTransfer;
import cn.ksb.minitxt.common.entity.Novel;
import cn.ksb.minitxt.server.BaseServiceImpl;
import cn.ksb.minitxt.utils.NovelUtils;

public class DownloadService extends BaseServiceImpl<Novel> {

	@Override
	protected void execute() throws IOException {
		DataTransfer<?> dto = new DataTransfer<>();
		// ͨ���������ȡҪ���ص��ļ�����File
		File file = NovelUtils.getNovelFile(getData());
		boolean tbc = true; // to be continue
		if (!file.exists()) {
			tbc = false;
			dto.setResult(NovelConstants.FILE_NOT_FOUND);
		} else if (!file.canRead()) {
			tbc = false;
			dto.setResult(NovelConstants.FILE_CANNOT_READ);
		}
		getOut().writeObject(dto);
		if (tbc) {
			byte[] buffer = new byte[8192];
			int len = -1; 
			InputStream fis = null;
			
			try {
				fis = new FileInputStream(file);
				while ((len = fis.read(buffer)) != -1) {
					getOut().write(buffer, 0, len);
				}
				getOut().flush();
				getSocket().shutdownOutput(); // ��Ҫ����ʾ�����ɣ��������뷽�������ڵȴ���
			} finally {
				if (fis != null) {
					fis.close();
				}
			}
		}
	}

}
