package algs;

import java.util.*;
import java.util.stream.Collectors;

public class TVRemote {
    public static void main(String[] args) {
        List<List<Character>> list = new ArrayList<>();
        list.addAll(List.of(Arrays.asList('a', 'b', 'c', 'd', 'e', '1', '2', '3')));
        list.addAll(List.of(Arrays.asList('f', 'g', 'h', 'i', 'j', '4', '5', '6')));
        list.addAll(List.of(Arrays.asList('k', 'l', 'm', 'n', 'o', '7', '8', '9')));
        list.addAll(List.of(Arrays.asList('p', 'q', 'r', 's', 't', '.', '@', '0')));
        list.addAll(List.of(Arrays.asList('u', 'v', 'w', 'x', 'y', 'z', '_', '/')));
        System.out.println(solution2("word", list));
    }

    static int solution2(String word, List<List<Character>> lists){
        char[] chars = word.toCharArray();
        int result = 0, level = 0;
        List<Integer> indexes = new ArrayList<>();

        for (char aChar : chars) {
            for (int i = 0; i < lists.size(); i++) {
                if(lists.get(i).contains(aChar)){
                    indexes.add(i);
                    indexes.add(lists.get(i).indexOf(aChar));
                }
            }
        }
        if (!indexes.isEmpty()){
            for (int i = 0; i < indexes.size(); i++) {
                if (i <= 1) {
                    result += indexes.get(i);
                } else {
                    if ((indexes.get(i).equals(indexes.get(i-2))) && (level%2 == 0)){
                        continue;
                    }else {
                        result += Math.abs((indexes.get(i) - indexes.get(i-2)));
                    }
                }
            }
        }
        System.out.println(result);
        return 0;
    }
}
