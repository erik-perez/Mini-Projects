public class leetCode {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == num.charAt(num.length() - i -1)) {
                continue;
            } if (x < 0){
                return false;
            }
            return false;
        }
        return true;
    }

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++){


        }
        return num;
    }

}
