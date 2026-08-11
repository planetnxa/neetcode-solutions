class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()==t.length()){
        //     char[] schar = Arrays.sort(s.toCharArray());
        //     char[] tchar = Arrays.sort(t.toCharArray());

        //         if (Arrays.equals(schar,tchar)){
        //             return true;
        //         }

            

        // }
        // return false;


         if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
        // euurgh
    }
}
