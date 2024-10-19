class Solution {
    public boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
         HashMap<Character,Integer> map= new HashMap<>();
         for(char c: str1.toCharArray()){
             map.put(c,map.getOrDefault(c,0)+1);
         }
         for(char c: str2.toCharArray()){
             if(map.getOrDefault(c,0) > 0){
                 map.put(c,map.get(c)-1);
             } else {
                 return false;
             }
         }
         return true;
    }
}