
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        char[] array=strs[i].toCharArray();
        Arrays.sort(array);
        String arraystring=new String(array);
        if(!map.containsKey(arraystring)){
            map.put(arraystring,new ArrayList<>());
        }
            map.get(arraystring).add(strs[i]);
        
       } 
    return new ArrayList(map.values());
    }
}
