import java.util.Stack;
public class Calculator {
	private Stack<Integer> stack;
	
	public Calculator() {
		stack = new Stack<Integer>();
	}
	
	public void loadConstant(int n) {
		stack.push(n);
	}
	public void add() {
		int n = stack.pop();
		System.out.println(n);
		int m = stack.pop();
		System.out.println(m);
		stack.push(m + n);
	}
	public void subtract() {
		int n = stack.pop();
		int m = stack.pop();
		stack.push(m-n);; //use abs
	}
	public void multiply() {
		int n = stack.pop();
		int m = stack.pop();
		stack.push(n*m); //use abs
	}
	public void divide() {
		int n = stack.pop();
		int m = stack.pop();
		stack.push(m/n); //use abs
	}
	public void total() {
		int sum = 0;
		for(int i = 0; i< stack.size(); i++) {
			sum += stack.pop();
		}
		stack.push(sum);
	}
	
	public String toString() {
		String result = "[";
		String sep = " ";
		int i = 0;
		while( i < stack.size()){
			result += stack.get(i);
			i++;
			if (i< stack.size()) {
				result += sep;
			}
		}
		result += "].";
		
		return result;
	}
}
