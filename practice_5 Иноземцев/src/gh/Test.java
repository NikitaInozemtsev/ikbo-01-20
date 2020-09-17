package gh;

import java.util.Scanner;

public class Test {
    public static int var11() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            int m = sc.nextInt();

            if (m == 1) {
                return var11() + n + m;
            }
            else if(m == 0) {
                int k = sc.nextInt();

                if (k == 1) {
                    return var11() + n + k;
                }
                else if (k == 0){
                    return n;
                }
                else {
                    return var11() + n;
                }
            }
            else {
                return var11() + n;
            }
        }
        else if(n == 0) {
            int m = sc.nextInt();
            if (m == 1) {
                return var11() + n + m;
            }
            else if (m == 0) {
                return n + m;
            }
            else {
                return var11();
            }
        }
        else {
            int m = sc.nextInt();
            if (m == 1) {
                return var11() + m;
            }
            else if (m == 0) {
                return var11();
            }
            else {
                return var11();
            }
        }
    }

    public static void var12() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(n);
            var12();
        }
        else if (n == 0) {
            return;
        }
        else {
            var12();
        }
    }

    public static void var13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return ;
        }
        else {
            int m = sc.nextInt();
            if (m == 0) {
                return;
            }
            else {
                System.out.println(m);
                var13();
            }
        }
    }

    public static String var14(int N) {
        int k = N % 10;
        N /= 10;
        if (N == 0){
            return k + "";
        }
        return (var14(N) + " " + k);
    }

    public static String var15(int N) {
        int k = N % 10;
        N /= 10;
        if (N == 0){
            return k + "";
        }
        return (k + " " + var15(N));
    }


    public static void main(String[] args) {
        //System.out.println(var11());
        //var12();
        //var13();
        //System.out.println(var14(456));
        System.out.println(var15(897620));
    }
}
