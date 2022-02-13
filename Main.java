
// Java program for the above approach
import java.util.*;

class GFG {

	public static int sumOfTwoPerfectCubes(int N) {
		int count = 0;
		HashMap<Integer, Integer> cubes = new HashMap<>();
		for (int i = 1; i * i * i <= N; i++)
			cubes.put((i * i * i), i);

		Iterator<Map.Entry<Integer, Integer>> itr = cubes.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();

			int firstNumber = entry.getKey();

			int secondNumber = N - entry.getKey();
			if (cubes.containsKey(secondNumber)) {
				count++;
				break;
			}
		}
		return count;
	}

	// Driver code
	public static void main(String[] args) {
		int N = 10;
		int[] arr = {19, 79, 6, 3, 19, 50, 82, 34, 28, 73};
		int count = 0;
		for(int i = 0 ; i < N ; i++){
			count += sumOfTwoPerfectCubes(arr[i]);
		}
		System.out.println(count);
	}
}

