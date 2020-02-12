/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static node head;
    static class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void insert(int data)
    {
        node newN=new node(data);
        if(head==null)
        head=newN;
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newN;
        }
    }
    public static void pairwise()
    {
        node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.next.data);
            System.out.println(temp.data);
            temp=temp.next.next;
        }
        System.out.println(temp.data);
    }
    public static void display()
    {
        node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    
	public static void main(String[] args) {
	System.out.println("bhjk");
	Main ab=new Main();
	ab.insert(1);
	ab.insert(2);
	ab.insert(3);
	ab.insert(4);
	ab.insert(5);
	ab.insert(6);
//	ab.display();
ab.pairwise();
	
	}
}
