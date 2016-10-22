package ru.sbt;

/**
 * Всегда ли будет выполнена секция finally в подобном коде?
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    System.out.println("stop");
                }
            }
        });

        thread.start();
        thread.sleep(1000);
    }
}
