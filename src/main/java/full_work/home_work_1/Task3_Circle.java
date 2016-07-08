package full_work.home_work_1;

/**
 * Home_work_1
 * Task 3 - Circle
 */
public class Task3_Circle {

    public static void main(String[] args) {

        int h=10;
        int a=0;
        int b=100;
        Task3_Circle circle = new Task3_Circle();
        System.out.println("argValue  funcValue ");

        for (int i = 0; i < b/h; i++){
            System.out.println("    "+i+"       "+ circle.func(i));
        }
    }

    public double func(int value){
        return Math.tan(value);
    }


}
