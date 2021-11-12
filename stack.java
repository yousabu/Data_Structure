import static java.lang.System.out;

class stack{

    static int size = 5;
    static int  top = -1;
    static int stack[]= new int[size];

    static void push(int val){
        if(top == size-1){
            System.out.println("stack overflow");
        }else{
        top = top+1;
        stack[top] = val;
    }
    }
    static void display(){
        for(int i =0 ; i< size ; i++ ){
            System.out.print(stack[top]+ " ");
            top--;
        }
    }

    static void peek(){
        System.out.println(stack[top]);
    }




    public static void  main(String[] args){
        push(10);
        push(11);
        push(12);
        push(13);
        push(14);
        peek();
        display();
       
        
    }


}