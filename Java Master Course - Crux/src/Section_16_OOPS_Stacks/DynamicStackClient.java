package Section_16_OOPS_Stacks;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackUsingArrays stack = new DynamicStack(5);
		
		
		for(int i=1; i<=5; i++) {
			stack.push(i*10);
			stack.display();
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		System.out.println(stack.top());
		
		while(!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}
		
//		stack.pop();


	}

}
