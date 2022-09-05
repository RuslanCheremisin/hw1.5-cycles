

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        taskHard4();
        taskHard5();
    }
    public static void task1(){

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
    }
    public static void task2(){
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("\n");
    }
    public static void task3(){
        for (int i=0; i<=17; i=i+2){
            System.out.println(i);
        }
        System.out.println("\n");
    }
    public static void task4(){
        for (int i=10; i>=-10; i--){
            System.out.println(i);
        }
        System.out.println("\n");
    }
    public static void taskHard4(){
        for (int i=1; i<=30; i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.println(i+":pingpong");
                }else{
                    System.out.println(i+":ping");
                }
            }else if(i%5==0){
                System.out.println(i+":pong");
            }else{
                System.out.println(i+":");
            }
        }
        System.out.println("\n");
    }
    public static void taskHard5(){
        int fibonacci0 = 0;
        int fibonacci1 = 1;
        for (int i=1; i<=5; i++){
            System.out.print(fibonacci0+" ");
            fibonacci0 = fibonacci0+fibonacci1;
            System.out.print(fibonacci1+" ");
            fibonacci1=fibonacci1+fibonacci0;
        }

    }
}