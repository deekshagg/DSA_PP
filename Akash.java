import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class FundamentalsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FundamentalsApplication.class, args);

	System.out.println(sum(5, 9));
	}

	
	
	public static int sum (int a, int b) {
		int xor = (a ^ b);
		int carry = (a & b);
		while(carry != 0) {
			carry <<= 1;
			int newCarry = (xor & carry);
			xor = (xor ^ carry);
			carry = newCarry;
		}
		return xor;
	}

// public private protected default
	class Node{
		int data;
		ArrayList<Node> children;
		Node(int data) {
			children = new ArrayList();
			this.data = data;
		}
	}

	void dfs(Node par) {
		// base
		if(par.children == null || par.children.isEmpty())
			return;

		// call
		for(Node child : par.children) {
			dfs(child);
		}
	}

	int height(Node par) {
		// base
		if(par.children == null || par.children.isEmpty())
			return 1;

		// code
		int a = 7;
		int b = 9;


		//call
		int height = 0;
		for(Node child : par.children) {
			height = Math.max(height(child), height);
		}

		//return
		return height + 1;
	}
//	01001101
//	10101010
//	11100111 000010000
//	11110111


}
