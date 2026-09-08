class Solution {
    public boolean isSubsequence(String s, String t) {
        return check(s,t);
    }

//Using simple recursion to find all subsequences and checking if s is subsequence of t :) Time 2 power n complexity 
    // boolean check(String up, String p, String toCheckWith){
    //     if(up.isEmpty()){
    //         if(p.equals(toCheckWith)){
    //             return true;
    //         }
    //         return false;
    //     }
    //     if(p.length()>toCheckWith.length()){
    //         return false;
    //     }
    //     boolean first=check(up.substring(1),p+up.charAt(0),toCheckWith);
    //     boolean second=check(up.substring(1),p,toCheckWith);
    //     return first || second;
    // }

//Using two pointer with each recursive call to find . Actually very easy and make sense :)
    boolean check(String s, String t){
        if(s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        if(s.charAt(0 )==t.charAt(0)){
            return check(s.substring(1),t.substring(1));
        }
        return check(s,t.substring(1));
    }
}