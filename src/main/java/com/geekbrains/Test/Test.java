package com.geekbrains.Test;

public class Test {

}

// 1
//class TT {
//    private static int count = 0;
//    private final int id = ++count;
//
//    private void methodA () {
//        System.out.println("TT.methodA " + id);
//    }
//
//    public void methodTT(TT t) {
//        t.methodA();
//    }
//}
//
//
//class Test1 {
//    public static void main(String[] args) {
//        TT t1 = new TT();
//        TT t2 = new TT();
//        t2.methodTT(t1);
//    }
//}


// 2
//class B {
//    public static void main(String[] args) {
//        big_loop:
//        for (int i = 0; i < 3 ; i++) {
//            try {
//                for (int j = 0; j < 3 ; j++) {
//                    if (i == j) continue;
//                    else if (i > j) continue big_loop;
//                    System.out.print("A");
//                }
//            } finally {
//                System.out.print("B");
//            }
//            System.out.print("C");
//        }
//    }
//}


// 3
//class Main {
//    public static void main(String[] args) {
//        System.out.print(Values.A);
//    }
//}
//
//enum Values {
//    A(1), B(2), C(3);
//
//    Values(int i) {
//        System.out.print(i);
//    }
//
//    static  {
//        System.out.print("static");
//    }
//}


// 4
//class Test2 {
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 10;
//        int c = 1 >> a++ + ++b - --a - b << 1;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}


// 5 Перечислите все методы, которые есть у класса Object.


// 6 вывести алфавит


class Test3 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; ++i) {
            System.out.print(i);
        }
    }
}











// 7
//    создать метод который на вход принимает строку
//    данный метод должен распечатать строку в обратном порядке

