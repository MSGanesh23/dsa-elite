import java.util.*;

class Activity {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class problem1 {

    static int activitySelection(int[] start, int[] finish) {

        int n = start.length;

        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        int count = 1;
        int lastFinish = activities[0].finish;

        for (int i = 1; i < n; i++) {

            if (activities[i].start >= lastFinish) {
                count++;
                lastFinish = activities[i].finish;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        System.out.println(activitySelection(start, finish));
    }
}