class Solution {

    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];
            return a[0] - b[0];
        });

        ArrayList<Integer> lis = new ArrayList<>();

        for (int[] env : envelopes) {

            int h = env[1];

            int left = 0;
            int right = lis.size();

            while (left < right) {

                int mid = (left + right) / 2;

                if (lis.get(mid) < h)
                    left = mid + 1;
                else
                    right = mid;
            }

            if (left == lis.size())
                lis.add(h);
            else
                lis.set(left, h);
        }

        return lis.size();
    }
}