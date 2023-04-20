package TutorOps;

public class palindrome {
    public static void main(String[] args) {
        boolean flag = true;
        String s = "abcdcba";
        StringBuffer sb = new StringBuffer();
        int i = s.length()-1;
        while(i>=0){
            sb.append(s.charAt(i));
            i--;
        }
        for(int x = 0; x<s.length(); x++){
            if(s.charAt(x)!=sb.charAt(x)){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
