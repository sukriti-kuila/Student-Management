package _2041011046;
import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		while (true)
		{
			System.out.println("------------MENU------------");
			System.out.println("Enter 0 : Exit Code");
			System.out.println("Enter 1 : Create List");
			System.out.println("Enter 2 : Display Student Details");
			System.out.println("Enter 3 : Display Topper");
			System.out.println("Enter 4 : Display Failed Students");
			System.out.println("Enter 5 : Display Sorted List");
			System.out.println("Enter Your Choice");
			int input = sc.nextInt();
			switch (input)
			{
			case 0 : System.exit(0);break;
			case 1 : list.create();break;
			case 2 : list.displayLinkedList();break;
			case 3 : list.findTopper();break;
			case 4 : list.displayFailedList();break;
			case 5 : list.sort();list.displayLinkedList();break;
			}
		}
	}

}
