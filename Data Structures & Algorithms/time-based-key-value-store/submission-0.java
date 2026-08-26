class TimeMap {
    Map<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            Map.Entry<Integer,String>entry=map.get(key).floorEntry(timestamp);
            if(entry==null)
            return "";
            return entry.getValue();
        }
        else 
        return "";

    }
}
