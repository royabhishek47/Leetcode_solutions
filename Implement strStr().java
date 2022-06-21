//Implement strStr()

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()<1) return 0;
        int p1 = 0;
        int p2 = 0;
        int lastOccurence = 0;
        while (p1<needle.length() && p2<haystack.length()) {
            if (needle.charAt(p1) == haystack.charAt(p2)) {
                if (p1==0) lastOccurence = p2;
                p1++;
            }
            else if (needle.charAt(p1) != haystack.charAt(p2) && p1!=0) {
                p1=0;
                p2=lastOccurence;
                }
            p2++;
        }
        return (p1==needle.length()) ? p2-needle.length() : -1;
    }
}