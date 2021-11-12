class queue{
    static int front = 0;
    static int rear = -1;
    static int num_item = 0;
    static int myQue[] = new int[5] ;
    static void enqueue(int elm){
        if(rear == 4)
            rear = -1;
        rear++;
        myQue[rear] = elm;
        num_item++;

    }
    static void dequeue(){
        int elm = myQue[front];
        front++;
        if(front == 5)
            front = 0;
        num_item--;
        System.out.println("Done Deleted >>> "+ elm);
    }
    static void peak(){
        System.out.println("the is >>> "+ myQue[front]);
    }

    public static void main(String[] args){
        enqueue(5);
        enqueue(4);
        enqueue(2);
        enqueue(3);
        enqueue(9);
 
        System.out.println(rear);

        peak();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        peak();
        System.out.println(rear);
        System.out.println(front);
    }
}