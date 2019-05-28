package algos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class PredicateGenerator implements Supplier<String> {

    AtomicInteger ai = new AtomicInteger(1);

    @Override
    public String get() {
        return "p_"+ai.getAndIncrement();
    }
}
