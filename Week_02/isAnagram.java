package Week_02;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        // 放到一个26长度的数组，前一个每次加一，后一个每次减一，最后循环判断是否有非零元素
        // 先判断字符串长度是否相同
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i=0; i<26; i++) {
            if (arr[i]!=0) return false;
        }
        return true;
    }
}
