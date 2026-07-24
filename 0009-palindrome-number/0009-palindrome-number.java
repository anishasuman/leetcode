// class Solution {
//     public boolean isPalindrome(int x) {
//         String s = String.valueOf(x);
//         int l = 0;
//         int r = s.length()-1;
//         while(l<r){
//             if(s.charAt(l)!=s.charAt(r))return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x %10;
            x = x / 10;
        }
        if (x == rev) return true; // Even digits (1221)
        if (x == rev / 10) return true;// Odd digits (12321)
        return false;
    }
}