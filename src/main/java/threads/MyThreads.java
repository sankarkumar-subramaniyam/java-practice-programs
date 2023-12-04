package threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreads {

    volatile String s;

    public static void main(String[] args) {
        ReentrantLock rel = new ReentrantLock();
        AtomicInteger ai = new AtomicInteger();
        ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
        Semaphore binarySemaphore = new Semaphore(1);

        ArrayList<String> al = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();

    }
}
