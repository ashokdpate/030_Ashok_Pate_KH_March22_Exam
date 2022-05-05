import java.util.Scanner;
class Stacks{
	public void push1(int x,TwoStack q){
		q.arr[--q.top1]=x;
	}
	public void push2(int x,TwoStack q){
		q.arr[--q.top2]=x;
	}
	
	int pop1(TwoStack q){
		if(q.top1==-1)
			return -1;
		return q.arr[q.top1--];
	}
	
	int pop2(TwoStack q){
		if(q.top2==q.size)
			return -1;
		return q.arr[q.top2--];
	}
}
class TwoStack{
	int size;
	int top1,top2;
	int arr[]=new int[10];
	
	TwoStack(){
		int n=10;
		size=n;
		top1=-1;
		top2=size;
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			TwoStack q=new TwoStack();
			int Que=sc.nextInt();
			while(Que>0){
				int stack=sc.nextInt();
				int Queue=sc.nextInt();
				
				Stacks g=new Stacks();
				
				if(Queue==1){
					int a=sc.nextInt();
					if(stack==1)
					g.push1(a,q);
					else if(stack==2){
						g.push2(a,q);
					}
					else if(Queue==2){
						if(stack==1)
							System.out.print(g.pop1(q)+" ");
					}
					else if(stack==2){
						System.out.print(g.pop2(q)+" ");
					}
				}
			}
		}
	}
}