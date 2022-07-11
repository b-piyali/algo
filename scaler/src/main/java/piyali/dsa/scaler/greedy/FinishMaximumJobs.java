package piyali.dsa.scaler.greedy;

import java.util.ArrayList;

public class FinishMaximumJobs {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() == 0 || B.size() == 0 || A.size() != B.size()) {
            return 0;
        }

        int maxJobCount = 1;
        ArrayList<Activity> activityList = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            activityList.add(new Activity(A.get(i), B.get(i)));
        }
        activityList.sort(new CustomComparator());
        int i = 0;
        for (int j = 1; j < activityList.size(); j++) {
            if (activityList.get(j).start >= activityList.get(i).finish) {
                i = j;
                maxJobCount++;
            }
        }
        return maxJobCount;
    }
}

