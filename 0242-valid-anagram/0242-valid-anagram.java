class Solution {
    public boolean isAnagram(String s, String t) {
        int [] vals = new int[26];
        
        for(char a : s.toCharArray()) {
            vals[a - 'a']+=1;
        }
        
        for(char a : t.toCharArray()) {
            vals[a - 'a']-=1;
        }
        
        for(int a : vals) {
            if(a != 0) {
                return false;
            }
        }
        return true;
    }
}