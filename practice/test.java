import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        int[] array = {1, 4, 2, -2, -9, 10, 2, 12, 2, -4, -4, -4, -4, 2, 6, 7};
        List<int[]> output = findPeaks(array);

        // Print output as list of (index, peak)
        for (int[] tuple : output) {
            System.out.println("(" + tuple[0] + ", " + tuple[1] + ")");
        }
    }

    public static List<int[]> findPeaks(int[] array) {
        List<int[]> output = new ArrayList<>();
        int peak = array[0];
        int index = 0;

        for (int x = 1; x < array.length; x++) {
            // same sign as previous
            if (array[x] * array[x - 1] > 0) {
                if (peak < 0 && array[x] < peak) {
                    peak = array[x];
                    index = x;
                } else if (peak >= 0 && array[x] > peak) {
                    peak = array[x];
                    index = x;
                }
            } else {
                // sign changed → save the current run's peak
                output.add(new int[]{index, peak});
                peak = array[x];
                index = x;
            }
        }
        // add the last run’s peak
        output.add(new int[]{index, peak});

        return output;
    }
    }