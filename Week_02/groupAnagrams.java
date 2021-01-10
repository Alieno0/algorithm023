package Week_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 排序，将所有排好序的放置同一个里面
        /*
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);

            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
        */

        // 建立26的数组，并将所有字符串统一key格式
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            // 获取该字母下的频率
            for (int i=0; i<str.length(); i++) {
                count[str.charAt(i)-'a']++;
            }
            StringBuffer s = new StringBuffer();
            for (int i=0; i<26; i++) {
                if (count[i] != 0) {
                    s.append((char)(i + 'a'));
                    s.append(count[i]);
                }
            }
            String key = new String(s);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
