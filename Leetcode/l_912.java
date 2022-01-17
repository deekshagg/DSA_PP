class l_912 {
    public int[] sortArray(int[] nums) {
        int[] a = mergeSort(nums, 0, nums.length-1);
        return a;
    }
    public int[] mergeSort(int[] nums, int left, int right){
        if(left == right){
            int[] base = new int[1];
            base[0] = nums[left];
            return base;
        }
        // int left = 0;
        // int right = nums.length - 1;
        int mid = (left+right)/2;
        int[] lsh = mergeSort(nums, left, mid);
        int[] rsh = mergeSort(nums, mid+1, right);
        int[] sortedArray = mergeTwoArrays(lsh, rsh);
        return sortedArray;
    }
    public int[] mergeTwoArrays(int[] a1, int[] a2){
        int i = 0; 
        int j = 0;
        int k = 0; 
        
        int n = a1.length;
        int m = a2.length;
        int[] a3 = new int[n+m];
        while(i < n && j < m){
            if(a1[i]<a2[j]){
                a3[k] = a1[i];
                i++;
                k++;
            }
            else{
                a3[k] = a2[j];
                k++;
                j++;
            }
        }
        while(i < n){
            a3[k] = a1[i];
            k++;
            i++;
        }
        while(j < m){
            a3[k] = a2[j];
            k++;
            j++;
        }
        return a3;
    }
}
