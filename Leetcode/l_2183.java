class Solution {
    public long coutPairs(int[] nums, int k) {
        int n = nums.length;
        int[] gcd = new int[n];
        Set<Integer> factors = new HashSet<>();
        for (int i = 0; i < n; i++) {
			// step1
            gcd[i] = calculateGcd(nums[i], k);
			// step2
            factors.add(gcd[i]);
            factors.add(k / gcd[i]);
        }
		
		// step 3
        Map<Integer, List<Integer>> divided = new HashMap<>();
        for (int factor: factors) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (gcd[i] % factor == 0) list.add(i);
            }
            divided.put(factor, list);
        }

		// step 4
        long cnt = 0L;
        for (int i = 1; i < n; i++) {
            int d = gcd[i];
            int need = k / d;
            if (!divided.containsKey(need)) continue;
            List<Integer> candidates = divided.get(need);
			
			// binary search.
            int index = Collections.binarySearch(candidates, i - 1);
            if (index >= 0)
				cnt += index + 1; // when index is found, use everything (inclusive)
            if (index < 0) {
				// when the index is not found, use everything before that
                index = -index - 1;
                cnt += index;
            }
        }

        return cnt;
    }

    int calculateGcd(int n1, int n2) {
        if (n2 == 0) return n1;
        return calculateGcd(n2, n1 % n2);
    }
}
