import java.util.*;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size() ; i++) {
            if ( i% 2 !=0){
                System.out.println(nums.get(i));
            }
        }
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num:nums) {
            if (num % 2 ==0 && num !=prevNum ){
                System.out.println(num);
                prevNum=num;
            }

        }
        List<String> words = new ArrayList<>(List.of("fff","asd","fff","rty","xcfff"));
        Set<String> unikWords= new HashSet<>(words);
        System.out.println(unikWords);
        System.out.println(words.size() - unikWords.size());




    }
}
