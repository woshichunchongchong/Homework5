package U9_one_star;

import java.util.Date;

public class S9_3 {
	
	public static void main(String args[])
	{
		long speed = 10000;//���ڼ�¼���µ�����ʱ��
		
		Date date = new Date(speed);
		printDate(speed, date);
		speed *= 10;
		
		//ͨ��ѭ�������µ�����ʱ�䲢��ʾ����
		for(int i = 0; i < 7; i++) {
			date.setTime(speed);
			printDate(speed, date);
			speed *= 10;
		}
	}
	
//������ʾ����
		public static void printDate(long l, Date date) {
	
			System.out.println(l + ": " + date.toString());
	
		}
}
