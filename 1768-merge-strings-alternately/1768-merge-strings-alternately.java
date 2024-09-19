class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = word1.length()<word2.length()? word1.length() : word2.length();
        String merged = "";
        for(int i=0;i<min;i++){
            merged+=word1.charAt(i);
            merged+=word2.charAt(i);
        }
        merged += word1.length()<word2.length()? word2.substring(min) : word1.substring(min);
        return merged;
    }
}