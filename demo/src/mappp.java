import java.util.*;

public class mappp{

    public static void main(String[] args){
        List<String> slist=new ArrayList<String>();
        Map<String,String> snmap= new HashMap<String,String>();
        Map<String,Integer> nnmap= new HashMap<String,Integer>();
        Scanner in =new Scanner(System.in);

        nnmap.put("Z",0);
        nnmap.put("W",2);
        nnmap.put("U",4);
        nnmap.put("X",6);
        nnmap.put("G",8);
        nnmap.put("T",3);
        nnmap.put("F",5);
        nnmap.put("S",7);
        nnmap.put("O",1);
        nnmap.put("N",9);

        snmap.put("Z","ZERO");
        snmap.put("W","TWO");
        snmap.put("U","FOUR");
        snmap.put("X","SIX");
        snmap.put("G","EIGHT");
        snmap.put("T","THREE");
        snmap.put("F","FIVE");
        snmap.put("S","SEVEN");
        snmap.put("O","ONE");
        snmap.put("N","NINE");

        slist.add("Z");
        slist.add("W");
        slist.add("U");
        slist.add("X");
        slist.add("G");
        slist.add("T");
        slist.add("F");
        slist.add("S");
        slist.add("O");
        slist.add("N");

        if(in.hasNext()){
            List<String> res =  new ArrayList<String>(in.nextInt());
            while(in.hasNext()){
                Map<String,Integer> map = getStringMap(in.next());
                List<Integer> list =new ArrayList<Integer>();
                for(Iterator iter=slist.iterator();iter.hasNext();){
                    String key = iter.next().toString();
                    while(map.containsKey(key) && map.get(key).intValue()>0){
                        System.out.println(nnmap.get(key).intValue());
                        list.add(nnmap.get(key).intValue());
                        String s = snmap.get(key).toString();
                        for(int i=0;i<s.length();i++){
                            String keyin = String.valueOf(s.charAt(i));
                            map.put(keyin,map.get(keyin).intValue()-1);
                        }
                    }
                }
//                System.out.println(list);
            }
        }
    }

    public static Map<String,Integer> getStringMap(String s){
        Map<String,Integer> map= new HashMap<String,Integer>();
        String c ;
        for(int i=0;i<s.length();i++){
            c=String.valueOf(s.charAt(i));
            if(map.containsKey(c)){
                map.put(c,map.get(c).intValue()+1);
            }
            else{
                map.put(c,0);
            }
        }
        return map;
    }

}