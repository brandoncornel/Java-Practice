public class Main{

    public static LinkedList list = new LinkedList();

    public static void main(String [ ] args)
    {
       System.out.println(factorial(3));
        for(int i = 0;i<200;i+=5){
            list.add(i);
        }
        System.out.println(list.toString());
        list.remove(5);
        System.out.println(list.toString());

    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * (factorial(n-1));
        }

    }



}