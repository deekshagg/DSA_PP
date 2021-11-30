void display(){

}

void addLast(int val){
    Node node = new Node();
    node.data = val;
    node.next = node;
    if(size==0){
        head = tail = node;
    }else{
        tail.next = node;
        tail = node;
    }
    size++;
}