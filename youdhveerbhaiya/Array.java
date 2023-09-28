package youdhveerbhaiya;
import java.util.Scanner;

class Array {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array: ");
        int length = sc.nextInt();
        int a[] = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements of array are:");
        for (int i = 0; i < length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the value of rotation postion");
        int d=sc.nextInt();
        System.out.println("Array after Rotation");
        for(int i=d; i< length;i++){
            System.out.print(a[i]+",");
        }
        for(int i=0;i<d;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
