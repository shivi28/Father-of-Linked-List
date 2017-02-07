import java.util.*;
import java.lang.*;
class LinkedList{
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	static Node head, head1, head2;
	

	public void display(){
		Node node =head;
		System.out.println("LL data is ");
		while(node!=null){
			System.out.print(node.data+ " " );
			node=node.next;
		}
		return ;
	}
	
	static void display(Node nodes){
		Node node =nodes;
		System.out.println("LL data is ");
		while(node!=null){
			System.out.print(node.data+ " " );
			node=node.next;
		}
		return ;
	}
			
	/*void insertatend( int d){
		Node newnode=new Node(d);
		Node node=head, prev=node;
		while(node !=null){
			prev =node;
			node=node.next;
		}
		prev.next=newnode;
		return ;
	}*/
	

	void insertatfront(int d){
		Node newnode= new Node(d);
		newnode.next=head;
		head=newnode;
		return ;
	}

	void insert(int d, int position){
		Node node=head,prev=node;
		Node newnode=new Node(d);
		while(position!=1 && head !=null){
			prev=node;
			node=node.next;
			position--;
			if(node==null){
				System.out.println("error\n");
			}
		}
		newnode.next=prev.next;
		prev.next=newnode;
		return;
	}

	
	void deletekey(int key){
		Node node=head, prev=node;
		if(head==null){
			System.out.print("Empty Linked List\n");
		}
		while(node!=null && node.data!=key){
			prev=node;
			node=node.next;
			if(node==null){
				System.out.println("No such key present");
				return ;
			}
		}
		prev.next=node.next;
	}

	void deletenode(int position){
		if(head==null){
			System.out.println("Empty LL");
			return ;
		}
		Node node=head, prev=node;
		while(position!=1){
			prev=node;
			node=node.next;
			position--;
		}
		prev.next=node.next;
	}

	static int iterative(Node node, int count){
		if(node==null){
			return 0;
		}
		else{
			while(node!=null){
				count++;
				node=node.next;
			}
			return count;
		}
	}

	static int recursive(Node node, int count){
		if(node==null){
			return count;
		}
		else{
			count++;
			return iterative(node.next, count);
		}
	}

	void iterativesearch( int key){
		Node node=head;
		
	
			while(node.data!=key && node!=null){
				node=node.next;
			}
			if(node.data==key){
				System.out.println("Element is found ");
				return ;
			}
			if(node==null){
			System.out.println("Element is not found ");
			return;}
	
	}

	  boolean recursivesearch( Node node,int key){
		if(node.data==key){
			//System.out.println(key+"is found in the LL \n");
			return true;
		}
		if(node==null){
			//System.out.println(key+" is not found");
			return false;
		}
		 return recursivesearch(node.next ,key);
	
	}

	void swapnodes(int a, int b){
		int count1=a, count2=b;
		Node prev1=head,bs, node1=head;
		while(count1!=1){
			prev1=node1;
			node1=node1.next;
			count1--;
		}
		Node prev2=head, node2=head;
		while(count2!=1){
			prev2=node2;
			node2=node2.next;
			count2--;
		}
		//System.out.println("node 1 node2 prev1 prev2 data is "+node1.data+" "+ node2.data+ " "+prev1.data+" "+ prev2.data+" \n");
		bs=node2.next;
		prev1.next=node2;
		node2.next=node1.next;
		prev2.next=node1;
		node1.next=bs;
		
		
	}
	
	void getnode(int n){
		Node node=head;
		while(n!=1 && node!=null){
			node=node.next;
		}
		if(n==1){
			System.out.println("node data is"+node.data);
		}
		else{
			System.out.println("No such node exist");
		}
	}
	
	Node getmiddle(){
		Node mid=head, node=head;
		int count=1;
		if(head==null){
			//System.out.println("LL is empty");
			return null;
		}
		while(node!=null){
			if(count%2==0){
				mid=mid.next;
			}
			node=node.next;
			count++;
		}
		//System.out.println("The middle element is "+ mid.data);
		return mid;
	}
	
	void printfromend(int n){
		if(head==null){
			return ;
		}
		
		Node node=head;
		while(n!=0 && node!=null){
			node=node.next;
			n--;
		}
		if(n==0){
			Node prev=head;
			while(node!=null){
				prev=prev.next;
				node=node.next;
			}
		
			System.out.println("Nth node from end data is "+ prev.data);
	}}
	
		
	void deleteLL(){
		head=null;
	}
	
	void CountOfInt(int key){
		Node node=head;
		int count=0;
		while(node!=null)
		{
			if(node.data==key){
				count++;
			}
			node=node.next;
		
		}
		System.out.println("The number of time "+key+ " appears in the LL is "+ count);
	}
	
	
	void alternatedelete(Node node){
		if(node==null || node.next==null){
			return ;
		}
		Node prev=node, current=node.next;
		while(current!=null){
			prev.next=current.next;
			current=prev.next.next;
			prev=prev.next;
		}
	}
			
	void reverseLL(Node node){
		if(head==null){
			return ;
		}
		Node current=node, prev=null, next;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
	}

	void checkpalindrome(){
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		Node mid=getmiddle(), node=head;
		if(mid!=null){
			reverseLL(mid);
		}
		display();
		while(mid.next!=null){
			if(node.data!=mid.data){
				System.out.println("Not a palindrome");
				return;
			}
			node=node.next;
			mid=mid.next;
		}
		reverseLL(mid);
		display();
		
		System.out.println("Yes its a palindrome");
		
	}
		
	
	void removeduplicate(){
		if(head==null|| head.next==null){
			return;
		}
		Node node=head.next,prev=head;
		while(node!=null){
			if(node.data==prev.data){
				prev.next=node.next;
				node=node.next;
			}else{
				prev=prev.next;
				node=node.next;
			}
		}
		display();
	}
	
	void alternatesplit( Node head2){
		head2=head.next;
		int count=1;
		Node node1=head, node2=head2;
		while(node1!=null && node2!=null){
			if(count%2!=0){
				node1.next=node2.next;
				node1=node2.next;
				count++;
			}else{
				node2.next=node1.next;
				node2=node1.next;
				count++;
			}
		}
		//System.out.println("LL data after split is ");
		display(head);
		System.out.println();
		//System.out.println("LL data after 2nd split is ");
		display(head2);
	}
	
	static void compareLL(Node node1, Node node2){
		while(node1!=null || node2!=null){
			if(node1.data!=node2.data){
				System.out.println("LL is not same ");
				return;
			}
			node1=node1.next;
			node2=node2.next;
		}
		System.out.println("LL is same ");
	}
					
	Node reverseallk(Node node,int key){
		int count=0;
		Node current=node, prev=null, nexts=null;
		while(current!=null && count<key){
			nexts=current.next;
			current.next=prev;
			prev=current;
			current=nexts;
			count++;
		}
		if(current!=null)
		{
			node.next=reversealtk(current,key);
		}
		return prev;
							
	}
	
	Node reversealtk(Node node,int key){
		int count=0;
		Node current=node, prev=null, nexts=null, prev1=null;
		while(current!=null && count<key){
			nexts=current.next;
			current.next=prev;
			prev=current;
			current=nexts;
			count++;
		}
		System.out.println(current.data+"\n");
		node.next=current;
		count=0;
		while(count<key){
			prev1=current;
			current=current.next;
			count++;
		}
		if(current!=null)
		{
			prev1.next=reversealtk(current,key);
		}
		return prev;
							
	}
	
	void detectandremoveloop(){
		Node fast=head, slow=head, prev=fast;
		while(slow!=null){
			prev=fast;
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("loop is there");
				prev.next=null;
				break;
			}
		}
	}
	
	int  findsum(Node node){
		Node current= node;
		int count=0, sum=0;
		while(current !=null){
			sum=sum+(int)Math.pow(10,count)*current.data;
			count++;
			current=current.next;
		}
		return sum ;
	}
	
				
	void addtwolist(int c){
		int abc;
		Node node=head;
		while(c!=0 && node!=null){
			abc=c%10;
			c=c/10;
			node.data=abc;
			node=node.next;
		}
		//if(node==nu)
	}
	
			
		
	public static void main(String args[]){
		int count=0;
		LinkedList list = new LinkedList();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);
	 
		
		list.head2 = new Node(5);
		list.head2.next = new Node(0);
		list.head2.next.next = new Node(5);
		list.head2.next.next.next = new Node(4);
		list.head2.next.next.next.next = new Node(10);
	 	
		int a=list.findsum(head);
		System.out.println("A is "+a);
		int b=list.findsum(head2);
		System.out.println("B is "+b);
		a=a+b;
		System.out.println("C is "+a);
		list.addtwolist(a);
		display(list.head);
		
	}
}
