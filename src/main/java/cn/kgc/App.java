package cn.kgc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//        for(int i = 1; i < 10; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(i + "*" + j + "=" + (i*j) + " ");
//            }
//            System.out.println();
//        }


        for (int i = 9; i > 0; i--){
            for (int j = 1; j <= i; j ++){
                System.out.print(i + "*" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }


//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int n = input.nextInt();
//        for (int i = 2; i < n; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i-1; j++) {
//                if (i%j==0){
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag){
//                System.out.println(i);
//            }
//        }
    }






//    public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            int a = input.nextInt();
//            for (int i = 1; i <= a; i++){
//                for (int y = 2; y < i; y++) {
//                    if (i%y==0){
//                        int b = a-i;
//                        for (int n = 2; n < b; n++) {
//                            if (b%n==0){
//                                System.out.println("a+b=" + i + "+" +b);
//                            }
//                        }
//                    }
//                }
//            }
//    }

}
