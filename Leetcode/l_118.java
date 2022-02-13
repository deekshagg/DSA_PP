package Leetcode;

class l_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> p_triangle = new ArrayList<>();
        if(numRows==0) return p_triangle;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        
        p_triangle.add(firstrow);
        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prev = p_triangle.get(i-1);
            List<Integer> newrow = new ArrayList<>();
            newrow.add(1);
            for(int j = 1; j < i ; j++){
                newrow.add(prev.get(j-1) + prev.get(j));
            }
            newrow.add(1);
            p_triangle.add(newrow);
        }
        return p_triangle;
    }
}
