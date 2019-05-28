package queries.bitmaps;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BitMap {

    public int[] bitmap;
    private int size;

    public BitMap(int size) {
        bitmap = new int[size];
        this.size = size;
    }

    public void onAll() {
        for (int i = 0; i<size; i++)
            bitmap[i] = 1;
    }

    public void offAll() {
        for (int i = 0; i<size; i++)
            bitmap[i] = 0;
    }

    public void invert() {
        for (int i = 0; i<size; i++)
            bitmap[i] = 1-bitmap[i];
    }

    public void on(int pos) {
        if (pos >= 0 && pos < size) {
            bitmap[pos] = 1;
        }
    }

    public void off(int pos) {
        if (pos >= 0 && pos < size) {
            bitmap[pos] = 0;
        }
    }

    @Override
    public String toString() {
        return "B'"+ Arrays.stream(bitmap).mapToObj(Integer::toString).collect(Collectors.joining())+"'";
    }

}
