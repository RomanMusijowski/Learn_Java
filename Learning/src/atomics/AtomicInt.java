package atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {
    private final AtomicInteger counter = new AtomicInteger(0);
    private volatile int integerLock = 0;
    private int integer = 0;

    public Integer getCounter() {
        return counter.get();
    }

    public int getIntegerLock() {
        return integerLock;
    }

    public int getInteger() {
        return integer;
    }

    public void incrementSafe() {
        while (true) {
            Integer value = getCounter();
            int newValue = value +1;
            if (counter.compareAndSet(value, newValue)) {
                return;
            }
        }
    }

    public synchronized void incrementWithLock() {
        integerLock++;
    }

    public void incrementUnsafe() {
        integer++;
    }
}
