class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length()==t.length()){
        
        // same len, possible
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        if(Arrays.equals(tSort,sSort)){
            return true;
        }
     }
     return false;


    }
}
