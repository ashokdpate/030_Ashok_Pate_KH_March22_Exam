class ReverseLinkedListMain{
	public class Node{
		public int data;
		public Node next;
	}
	public Node(int data){
		this.data=data;
	}
}

	private Node head;
	private Node tail;
	
	public void addFirst(int data){
		Node Node=new Node(data);
		Node.next=head;
		head=node;
		if(tail==null){
			tail=head;
		}
	}

	public void reverse(Node data){
		if(node==tail){
			head=tail;
			return;
		}
		reverse(node.next);
		tail.next=node;
		tail=node;
		tail.next=null;
	}
	public void display(){
		Node trav=head;
		while(trav!=null){
			System.out.print(trav.data+ "-- > ");
			trav=trav.next;
		}
		System.out.println("Null");
	}


	public static void main(String []args){
			ReverseLinkedListMain rev=new ReverseLinkedListMain();
			System.out.println("Enter number :");
			int num=sc.nextInt();
			System.out.println("Enter elements in linked list");
			int elements=sc.nextInt();
			for(int i=0; i<elements; i++){
				int data=sc.nextInt();
				rev.addFirst(data);
			}
			rev.reverse(head);
			System.out.println("Display reveser linked list");
			rev.display();
	}
}