/**
 * @description: baitap lab2
 * @author: Duong Danh Dung
 * @version 1.0
 * @created: Sep 21, 20253:10:47 PM
 */

package tuan1.bai9;

public class IfElseDemo {
	public static void main(String[] args) {
		int testcore=76;
		char grade;
		if(testcore >=90) {
			grade = 'A';
		}
		if(testcore >=80) {
			grade = 'B';
		}
		if(testcore >=70) {
			grade = 'C';
		}
		if(testcore >=60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("grade: "+ grade);
	}

}


