package TutorOps;

import java.util.*;

public class Semordnilap{
    public static ArrayList<String> main(String[] words) {
        Set<String> wordSet = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for(String word : words){
        String reverse = reverse(word);
        if(wordSet.contains(reverse)){
        ArrayList<String> list = new ArrayList<>();
        list.add(reverse);
        list.add(word);
        result.addAll(list);
        wordSet.remove(word);
        }else{
        wordSet.add(word);
        }
    }
    return result;
}
static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
    }
}