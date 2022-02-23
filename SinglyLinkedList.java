package _2041011046;
import java.util.*;

public class SinglyLinkedList {
static Node start=null;
static Node q = null;
Scanner sc = new Scanner (System.in);

// Creation Of The LinedList
	 void create()
	{
		char ch;
		do
		{
			Node p = new Node ();
			p.link=null;
			System.out.println("Enter Name, Roll & Mark");
			String name=sc.next();
			int roll=sc.nextInt();
			double mark=sc.nextDouble();
			p.stud=new Student();
			p.stud.setStudentDetails(name,roll,mark);			
			if (start==null)
			{
				start=p;
				q=p;
			}
			else 
			{
				q.link=p;
				q=p;
			}
			System.out.println("Press Y to continue");
			ch=sc.next().charAt(0);
		}while(ch=='Y');
	}
	 
	 // Displaying The LinkedList
	void displayLinkedList ()
	{
		Node s = start;
		while (s!=null)
		{
			s.stud.displayStudent();
			s=s.link;
		}
	}
	
	// Method To Find The Topper(s)
	void findTopper ()
	{
		sort();
		Node s = start;
		Node i = start.link;
		s.stud.displayStudent();
	// If there are multiple toppers
		while (s!=null)
		{
			if ((s.stud.mark==i.stud.mark))
			{
				i.stud.displayStudent();
				i=i.link;
			}
			else 
				break;
		}
	}
	
	// Displaying Details of Failed Students (Mark<40)
	void displayFailedList()
	{
		Node s = start;
		int count = 0;
		while (s!=null)
		{
			if (s.stud.mark<40)
			{
				s.stud.displayStudent();
				count++;
			}
			s=s.link;
		}
		if (count==0)
			System.out.println("There is no failed student");
	}
	
	// Sorting The LinkedList in Descending Order
	void sort ()
	{
		Node i = start;
		Node j = null;
		while (i!=null)
		{
			j=	i.link;
				while (j!=null)
				{
					if (i.stud.mark<j.stud.mark)
					{
						Student temp =i.stud;
						i.stud=j.stud;
						j.stud=temp;
					}
					j=j.link;
				}
			i=i.link;
		}
	}
}
