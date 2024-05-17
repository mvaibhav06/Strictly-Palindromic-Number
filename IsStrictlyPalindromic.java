class IsStrictlyPalindromic {
    public static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb = sb.reverse();
        s = sb.toString();
        return s;
    }
    public static String base(int n, int b){
        String out = "";
        int num = n;

        while(num > 0){
            int a = num%b;
            num /= b;
            out += a;
        }

        out = reverse(out);
        return out;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++){
            String s = base(n,i);
            String rev = reverse(s);
            if(!s.equals(rev)){
                return false;
            }
        }
        return true;
    }
}
