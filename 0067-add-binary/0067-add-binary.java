class Solution {
    public String addBinary(String a, String b) {
        int x = a.length();
        int y = b.length();

        int i = x - 1;
        int j = y - 1;

        String ans = "";
        boolean carry = false;

        while (i >= 0 || j >= 0) {

            int sum = 0;

            if (i >= 0 && a.charAt(i) == '1') {
                sum++;
            }

            if (j >= 0 && b.charAt(j) == '1') {
                sum++;
            }

            if (carry) {
                sum++;
            }

            if (sum == 0) {
                ans = "0" + ans;
                carry = false;
            } 
            else if (sum == 1) {
                ans = "1" + ans;
                carry = false;
            } 
            else if (sum == 2) {
                ans = "0" + ans;
                carry = true;
            } 
            else {
                ans = "1" + ans;
                carry = true;
            }

            i--;
            j--;
        }

        if (carry) {
            ans = "1" + ans;
        }

        return ans;
    }
}