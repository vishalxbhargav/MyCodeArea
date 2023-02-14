public class reversewordinstringii {
    public void reverseWords(char[] s) {
        if (s.length == 0) {
            return;
        }
        reverse(s, 0, s.length - 1);
        int left = 0;
        for (int i = 0; i <= s.length; i ++) {
            if (i == s.length || s[i] == ' ') {
                reverse(s, left, i - 1);
                left = i + 1;
            }
        }
    }
    private void reverse(char[] s, int l, int r) {
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l ++;
            r --;
        }
    }
}