package Leetcode;
class OrderedStream {
    String[] arr; //Stores the String values in the id'th index.
    int size; //size of orderedstream
    int ptr; //pointer to hold current position
    
    public OrderedStream(int n) {
        size = n;
        arr = new String[size+1]; //size+1 cuz of id starts from 1.
        ptr = 1; //it starts from 1 cuz of id is between 1 and n
    }
    
    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>(); //local list to return.
        arr[id] = value; //puts the string value to the index of id.
		
		//This loop iterates untill our pointer points null. While it is not null
		//It points value of pointer and add it to our List to return.
        while(ptr<=size){
             if(arr[ptr]==null)break;//If our pointer is null then we can break the loop.
             list.add(arr[ptr++]);//If pointer is not null then add pointer value to list and increase the pointer for next values.
        }
		
        return list;
    }   
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */