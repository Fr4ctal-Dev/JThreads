package com.company.u1;

import java.util.ArrayList;

public class Threads1 {
    static class GreetThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello, this is thread " + this.getId());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<GreetThread> threads = new ArrayList<>();
        threads.add(new GreetThread());
        threads.add(new GreetThread());
        threads.add(new GreetThread());
        for (GreetThread t:
             threads) {
            t.start();
        }
        for (GreetThread t:
                threads) {
            t.join();
        }
    }

}
