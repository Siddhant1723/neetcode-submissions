class Solution {

    public String encode(List<String> strs) {
        String str="";
        for(int i=0;i<strs.size();i++){
            str+=strs.get(i).length()+"#"+strs.get(i);
        }
        return str;
    }

    public List<String> decode(String str) {
        int p1=0;
        int p2=0;
        int len=0;
        List<String> sting=new ArrayList<>();
        while(p2<str.length()){
        while(p2<str.length()&&str.charAt(p2)!='#'){
            p2++;
        }
        len=Integer.parseInt(str.substring(p1,p2));
        sting.add(str.substring(p2+1,p2+len+1));
        p2=p2+len+1;
        p1=p2;
    }
    return sting;
}
}