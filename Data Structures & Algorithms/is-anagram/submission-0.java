class Solution {
    public boolean isAnagram(String s, String t) {
        System.out.print("Input: s = "+s+", t = "+t);
    HashMap<Character,Integer>map=new HashMap<>();
    HashMap<Character,Integer>pam=new HashMap<>();
    for(char ch:s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
    }
    for(char hc:t.toCharArray()){
        if(pam.containsKey(hc)){
            pam.put(hc,pam.get(hc)+1);
        }else{
            pam.put(hc,1);
        }
    }
    if(map.equals(pam)){
        return true;
    }else{
        return false;
    }
    }
}