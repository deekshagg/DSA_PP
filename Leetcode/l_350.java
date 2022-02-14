package Leetcode;

class l_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
           
            for(int i = 0 ; i<nums1.length;i++){
                hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
            }
            
            for(int j = 0; j<nums2.length;j++){
                if(hm.containsKey(nums2[j]) && hm.get(nums2[j])>0){
                  
                    hm.put(nums2[j],hm.getOrDefault(nums2[j],0)-1);
                      list.add(nums2[j]);
                }
            }
             int [] ans = new int[list.size()];
            for(int i  =0;i<list.size();i++){
                ans[i] = list.get(i);
            }
            return ans;
        } 
    }