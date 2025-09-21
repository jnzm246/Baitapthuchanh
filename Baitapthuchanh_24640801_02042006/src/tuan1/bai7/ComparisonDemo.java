/**
 * @description: baitap lab2
 * @author: Duong Danh Dung
 * @version 1.0
 * @created: Sep 21, 20252:51:57 PM
 */

package tuan1.bai7;

public class ComparisonDemo {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		System.out.println("value1==value2: " + (value1==value2));
		System.out.println("value1!=value2: " + (value1!=value2));
		System.out.println("value1>value2: " + (value1>value2));
		System.out.println("value1<value2: " + (value1<value2));
		System.out.println("value1<=value2: " + (value1<=value2));
		System.out.println("value1<=value2 && value1==value2: " + ((value1<=value2)&&(value1==value2)));
		System.out.println("value1<=value2 || value1==value2: " + ((value1<=value2)||(value1==value2)));
		
	}
	/* ==: so sanh bang (neu bang tra ve true)
	 * !=: so sanh khong bang (neu khong ban tra ve true)
	 * > va < so sanh lon hon be hon
	 * <= so sanh be hon hoac bang
	 * && va (dung 2 dk = true)
	 * || hoac(1 trong hai dk dung = true)*/
}


