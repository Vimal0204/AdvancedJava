package com.stunnedjava;

public class even implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 20; i++) {
            if (i % 2==0 ) {
                System.out.println(i);
            }
        }
    }
}
