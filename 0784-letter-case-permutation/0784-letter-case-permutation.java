class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> permutations=new LinkedList<>();
        helper("", permutations, 0, s);
        return permutations;
    }
    
    public void helper(String candidate, List<String> permutations, int start, String s){
        if(candidate.length()==s.length()){
            permutations.add(candidate);
            return;
        }
        for(int i=start;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                candidate+=Character.toLowerCase(c);
                helper(candidate,permutations,i+1,s);
                candidate=candidate.substring(0,candidate.length()-1);
                candidate+=Character.toUpperCase(c);
                helper(candidate,permutations,i+1,s);
                candidate=candidate.substring(0,candidate.length()-1);
            } else {
                candidate+=c;
                helper(candidate,permutations,i+1,s);
                candidate=candidate.substring(0,candidate.length()-1);
            }
        }
        return;
    }
}