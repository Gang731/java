//ѡ������
public class SortNums {
	public static void main(String[] args) {
		int[] arr={4,7,3,9,1};
		int min = -1 ; //��Сֵ�±�
		
		//��㣺 �Ƚϼ���
		for(int i=0;i<arr.length-1;i++){
			min=i;	//ÿ�ֳ�ʼֵ
			//�ڲ㣺��ǰԪ�غͺ���Ԫ�رȽϣ���¼���µ���СԪ���±�
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){	//������� ����>�ĳ�<
					min=j;
				}
			}        
			//���minֵ�����仯��˵�������˸�С��ֵ���򽫵�ǰֵ�͸�С��ֵ������
			//��֤Сֵ��������ǰ��
			if(min!=i){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		//�������������
		for(int num:arr){
			System.out.print(num+"\t");
		}
	}
}
