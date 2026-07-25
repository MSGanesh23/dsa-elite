import java.util.*;

class Job {
    int deadline, profit;

    Job(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class problem2 {

    static int[] jobScheduling(int[] deadline, int[] profit) {

        int n = deadline.length;

        Job[] jobs = new Job[n];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        // Sort by descending profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean[] slot = new boolean[maxDeadline + 1];

        int jobCount = 0;
        int totalProfit = 0;

        for (Job job : jobs) {

            for (int day = job.deadline; day >= 1; day--) {

                if (!slot[day]) {

                    slot[day] = true;
                    jobCount++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        return new int[]{jobCount, totalProfit};
    }

    public static void main(String[] args) {

        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};

        int[] ans = jobScheduling(deadline, profit);

        System.out.println("Jobs = " + ans[0]);
        System.out.println("Profit = " + ans[1]);
    }
}