package com.company.u1;

public class Threads3 {
    static class PingThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ping");
                yield();
            }
        }
    }
    static class PongThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("Pong");
                yield();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        PingThread pingThread = new PingThread();
        PongThread pongThread = new PongThread();

        pingThread.start();
        pongThread.start();

        Thread.sleep(1000);

        pingThread.stop();
        pongThread.stop();

        pingThread.join();
        pongThread.join();

    }

}
