public class Main {

    public static void main(String[] args) {
        swapNumbers();

    }

   
    public static void swapNumbers(){
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a +" b ="+b);
    }

    public void postJira(){
        System.out.println("postJira");
        System.out.println("postJira2");
        System.out.println("postJira3");

    }


    
}
