package box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        float length =0;
        float width = 0;
        int height = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length : ");
        length = scanner.nextFloat();
        System.out.print("Please enter object's width : ");
        width = scanner.nextFloat();
        System.out.print("Please enter object's height : ");
        height = scanner.nextInt();
        Box box3 = new Box3();
        Box box5 = new Box5();
        if(box3.validate(length,width,height)){
            System.out.println("Box3");
        }else if (box5.validate(length,width,height)){
            System.out.println("Box5");
        }else{
            System.out.println("No Box");
        }

    }
}
