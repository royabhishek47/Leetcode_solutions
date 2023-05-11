package TutorOps;

public class NonRepetingChar {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdcaf");
        boolean flag = true;
        for(int i = 0; i<s.length(); i++){
            flag = true;
            for(int j = 0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}
