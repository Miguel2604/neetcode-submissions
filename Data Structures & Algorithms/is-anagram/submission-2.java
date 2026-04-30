
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        HashMap<Character, Integer> firstHash = new HashMap<>();
        HashMap<Character, Integer> secondHash = new HashMap<>();

        int firstCounter = 0;
        int secondCounter = 0;
        
        for(int i = 0; i < firstString.length; i++){
                if (firstString.length != secondString.length) {
                    return false;
                }
                if (firstHash.containsKey(firstString[i])) {
                    firstCounter = firstHash.get(firstString[i]) + 1;
                    firstHash.put(firstString[i], firstCounter);           
            }
                else{
                    firstHash.put(firstString[i], 1);
                }
                if (secondHash.containsKey(secondString[i])) {
                    secondCounter = secondHash.get(secondString[i]) + 1;
                    secondHash.put(secondString[i], secondCounter);           
            }
                else{
                    secondHash.put(secondString[i], 1);
                }
        }
        if(firstHash.equals(secondHash)){
            return true;
        }
        return false;
    }
} 

