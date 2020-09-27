package gh;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0;i < 5; i++) {
            b[i] = sc.nextInt();
        }

        //Stack_ st = new Stack_(a, b);
        Queue_ qu = new Queue_(a, b);
    }
}

class Stack_ {
    private Stack<Integer> first = new Stack<>();
    private Stack<Integer> second = new Stack<>();
    private boolean winner;
    private int steps = 0;
    public Stack_(int[] a, int[] b) {
        for (int i = 0;i < a.length; i++) {
            first.push(a[i]);
            second.push(b[i]);
        }
        game();
    }
    public void game() {
        int xF = first.pop();
        int xS = second.pop();
        if (xF > xS) {
            if (xF == 9 && xS == 0) {
                Stack<Integer> temp = new Stack<>();
                temp.push(xF);
                temp.push(xS);
                temp.addAll(second);
                second = temp;
            }
            else {
                Stack<Integer> temp = new Stack<>();
                temp.push(xF);
                temp.push(xS);
                temp.addAll(first);
                first = temp;
            }
        }
        else {
            if (xF == 0 && xS == 9) {
                Stack<Integer> temp = new Stack<>();
                temp.push(xF);
                temp.push(xS);
                temp.addAll(first);
                first = temp;
            }
            else {
                Stack<Integer> temp = new Stack<>();
                temp.push(xF);
                temp.push(xS);
                temp.addAll(second);
                second = temp;
            }
        }


        steps++;
        if (steps == 106) {
            System.out.println("botva");
            return;
        }

        if(first.empty()) {
            winner = true;
            conclusion();
        }
        else if (second.empty()) {
            winner = false;
            conclusion();
        }
        else {
            game();
        }
    }
    public void conclusion() {
        if(winner) {
            System.out.println("second " + steps);
        }
        else {
            System.out.println("first " + steps);
        }
    }
}

class Queue_ {
    private ArrayDeque<Integer> first = new ArrayDeque<>();
    private ArrayDeque<Integer> second = new ArrayDeque<>();
    private boolean winner;
    private int steps = 0;
    public Queue_(int[] a, int[] b) {
        for (int i = a.length - 1;i > -1; i--) {
            first.addLast(a[i]);
            second.addLast(b[i]);
        }
        game();
    }
    public void game() {
        int xF = first.pollFirst();
        int xS = second.pollFirst();
        if (xF > xS) {
            if (xF == 9 && xS == 0) {
                second.addLast(xF);
                second.addLast(xS);
            }
            else {
                first.addLast(xF);
                first.addLast(xS);
            }
        }
        else {
            if (xF == 0 && xS == 9) {
                first.addLast(xF);
                first.addLast(xS);
            }
            else {
                second.addLast(xF);
                second.addLast(xS);
            }
        }


        steps++;
        if (steps == 106) {
            System.out.println("botva");
            return;
        }


        if(first.isEmpty()) {
            winner = true;
            conclusion();
        }
        else if (second.isEmpty()) {
            winner = false;
            conclusion();
        }
        else {
            game();
        }
    }
    public void conclusion() {
        if(winner) {
            System.out.println("second " + steps);
        }
        else {
            System.out.println("first " + steps);
        }
    }
}