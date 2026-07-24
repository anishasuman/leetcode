class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> events = new ArrayList<>();

        for (int[] b : buildings) {
            events.add(new int[]{b[0], -b[2]}); // start
            events.add(new int[]{b[1], b[2]});  // end
        }

        Collections.sort(events, (a, b) ->
            a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        PriorityQueue<Integer> p =
                new PriorityQueue<>(Collections.reverseOrder());

        p.add(0);

        int prev = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int[] e : events) {

            if (e[1] < 0)
                p.add(-e[1]);
            else
                p.remove(e[1]);

            int curr = p.peek();

            if (curr != prev) {
                ans.add(Arrays.asList(e[0], curr));
                prev = curr;
            }
        }

        return ans;
    }
}