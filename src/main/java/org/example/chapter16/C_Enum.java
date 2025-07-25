package org.example.chapter16;

/*
* === Enum 메서드 오버라이딩 ===
* : Enum은 상수별 다른 동작 정의
* - abstract 메서드를 선언하고 상수별 구현 가능
* */

enum Operation {
    ADD {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },

    SUBTRACT {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    }
    ;

    public abstract int apply(int x, int y);
}

enum Season {
    SPRING(),
    SUMMER(),
    AUTUMN(),
    WINTER();


}


public class C_Enum {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(3,5));
        System.out.println(Operation.SUBTRACT.apply(3,5));


        Season season = null;

        switch (season) {
            case SPRING -> System.out.println("봄봄봄");
            case SUMMER -> System.out.println("여름여름여름");
            case AUTUMN -> System.out.println("가을가을가을");
            case WINTER -> System.out.println("겨울겨울겨울");
        }
    }
}
