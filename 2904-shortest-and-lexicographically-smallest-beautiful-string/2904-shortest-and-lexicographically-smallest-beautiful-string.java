class Solution {

    public String shortestBeautifulSubstring(String s, int k) {

        int start = 0, low = 0, high = 0;
        int sum = 0, n = s.length();
        int min = Integer.MAX_VALUE;

        for (high = 0; high < n; high++) {

            if (s.charAt(high) == '1')
                sum++;

            while (sum == k) {

                int len = high - low + 1;

                // If shorter OR same length but lexicographically smaller
                if (len < min ||
                    (len == min &&
                     s.substring(low, high + 1)
                      .compareTo(s.substring(start, start + min)) < 0)) {

                    start = low;
                    min = len;
                }

                if (s.charAt(low) == '1')
                    sum--;

                low++;
            }
        }

        if (min == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + min);
    }
}