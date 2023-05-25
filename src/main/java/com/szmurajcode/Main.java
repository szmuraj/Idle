package com.szmurajcode;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int treeStack = 0;
        int cantStack = 0;
        int descStack = 0;

        int timberMan = 1;
        int time = 0;

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            time++;

            treeStack += tree(timberMan);
            System.out.println(treeStack + " Trees");

            if (treeStack>0 && time%2 == 0) {
                treeStack--;
                cantStack++;
                System.out.println(cantStack + " Cants");
            }

           if (cantStack>0 && time%4 == 0) {
                cantStack--;
                descStack+=5;
                System.out.println(descStack + " Desc");
            }
        }
    }

    public static int tree(int timberMan) {
        return timberMan;
    }
}