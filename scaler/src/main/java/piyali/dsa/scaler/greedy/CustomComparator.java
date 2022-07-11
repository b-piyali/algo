package piyali.dsa.scaler.greedy;

import java.util.Comparator;

public class CustomComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity o1, Activity o2) {
        return o1.finish - o2.finish;
    }
}
