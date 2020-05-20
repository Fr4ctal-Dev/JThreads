package com.company.u1;

import java.util.ArrayList;

public class Threads2 {

    static class CountThread extends Thread{
        int from;
        int to;

        public CountThread(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            for (int i = from; i < to; i++) {
                System.out.println("Number " + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<CountThread> threads = new ArrayList<>();
        threads.add(new CountThread(0, 99999));
        threads.add(new CountThread(100000, 199999));
        threads.add(new CountThread(200000, 299999));
        threads.add(new CountThread(300000, 399999));
        threads.add(new CountThread(400000, 499999));
        threads.add(new CountThread(500000, 599999));

        for (CountThread t:
                threads) {
            t.start();
            t.join();
        }
    }
}
