class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
         int j=0;
         int i=0;
         while(j<word1.length()  && i<word2.length()){
             sb.append(word1.charAt(j));
             sb.append(word2.charAt(i));
             j++;
             i++;
         }
         while(i<word1.length()){
             sb.append(word1.charAt(i));
             i++;
         }
    
    while(j<word2.length()){
             sb.append(word2.charAt(j));
             j++;
         }

  return sb.toString();
    }

}