package mjw.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMap{
    Lock2 lock = new Lock2();
    public void print() throws InterruptedException {
        lock.lock();
        doAdd();
        lock.unlock();
    }
    public void doAdd() throws InterruptedException {
        System.out.println("qqqqqq");
        lock.lock();
        System.out.println("ffffff");
        lock.unlock();
    }

    public static void main(String[] args) {
        TestMap a = new TestMap();
        try {
            a.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
