package fpa;

import java.util.Random;

public class test {
    private static final Random random = new Random(System.currentTimeMillis());
    public static void main(String[] args) {
        int i ;
        for (i = 0; i < 10; i++) {
           if(i==8) break;
        }
        System.out.println(i);
    }
}
