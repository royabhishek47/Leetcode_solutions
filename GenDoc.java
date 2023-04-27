package TutorOps;

public class GenDoc {
    public static boolean checkdoc(String str, String doc) {
        StringBuffer s = new StringBuffer(str);
        int i = 0;
        boolean flag = false;
        while (i < doc.length()) {
            boolean f = true;
            flag = false;
            int j = 0;
            while (!s.isEmpty() && f) {
                if (doc.charAt(i) == s.charAt(j)) {
                    flag = true;
                    s = s.deleteCharAt(j);
                    f = false;
                } else {
                    j++;
                }
            }
            if (flag == false) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Bste!hetsi ogEAxpelrt x";
        String doc = "AlgoExpert is the Best!";
        s = s.replaceAll("\\s","");
        doc = doc.replaceAll("\\s","");
        System.out.println(checkdoc(s, doc));
    }
}
