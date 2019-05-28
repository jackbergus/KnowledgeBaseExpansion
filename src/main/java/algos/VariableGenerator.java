package algos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class VariableGenerator implements Supplier<String> {

    AtomicInteger ai = new AtomicInteger(1);

    @Override
    public String get() {
        return "x_"+ai.getAndIncrement();
    }
}
