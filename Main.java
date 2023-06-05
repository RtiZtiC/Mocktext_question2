import java.util.*;
public class Main
{
    public int firstnonrep(String str){
        Map<Character,Integer> mymap=new HashMap<Character,Integer>();
        int pos=0;
        for(int i=0;i<str.length();i++)
        {
            
            if(mymap.containsKey(str.charAt(i)))
            {
                mymap.put(str.charAt(i),mymap.get(str.charAt(i))+1);
            }
            else{
                mymap.put(str.charAt(i),1);
            }
        }
        
        for(int j=0;j<str.length();j++){
            if(mymap.get(str.charAt(j))==1){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str="leetcode";
        Main obj=new Main();
        int num=obj.firstnonrep(str);
        System.out.println(num);
    }
}