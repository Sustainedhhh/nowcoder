import java.util.*;

public class shuchuan {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(in.hasNext()){
            int len = in.nextInt();
            for(int i=0;i<len;i++){
                list.add(in.nextInt());
            }
            list.sort(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1,Integer o2){
                    String s1= String.valueOf(o1);
                    String s2= String.valueOf(o2);
                    return (s2+s1).compareTo(s1+s2);
                }
            });
            for(Iterator iter=list.iterator();iter.hasNext();){
                System.out.print(iter.next());
            }
            System.out.println();
        }

    }
}
