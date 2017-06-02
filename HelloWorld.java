import java.util.*;
import java.util.Collections;
public class HelloWorld{

     public static void main(String []args){
        ArrayList<String> a = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        a.add("a1");
        a.add("a2");
        a.add("a3");
        a.add("a4");
        a.add("a5");
        a.add("a6");
        a.add("a7");
        a.add("a8");
        a.add("a9");
        a.add("a10");
        a.add("a11");
        a.add("a12");
        a.set(2,"a2(2)");
        Object[] o = new Object[25];
        o=a.toArray();
        for(int i=0;i<a.size();i++)
        {
            set.add(a.get(i));
        }
        TreeSet<String> sortedset=new TreeSet<String>(set);
        Iterator i = sortedset.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(sortedset);
        System.out.println(a.get(3));
        System.out.println(a);
        a.remove("a8");
        System.out.println(a.get(8));
        System.out.println(a.indexOf("a8"));
        ListIterator<String> l1 = a.listIterator(5);
        while(l1.hasPrevious())
        {
            System.out.println(l1.previous());
        }
        Map<String,String> m1= new HashMap<String,String>();
        m1.put("sid","dis");
        m1.put("sid1","1dis");
        m1.put("sid2","2dis");
        m1.put("sid4","4dis");
        m1.put("sid3","3dis");
        m1.put("sid7","7dis");
        m1.put("sid6","6dis");
        m1.put("sid5","5dis");
        //m1.remove("sid");
        Set<String> m2 = new HashSet<String>();
        m2 = m1.keySet();
        SortedSet<String> set12 = new TreeSet<String>(m2); 
        List<String> aa = new ArrayList<String>();
        aa.add("sql");
       // System.out.println(Collections.addAll("sidd",aa));
        System.out.println(aa);
        System.out.println(a);
        ArrayList<String> aa1=new ArrayList<String>();
        Collections.sort(a);
        System.out.println(m1.get("sid"));
       /* System.out.println(m2);
        System.out.println(m1.values());
        //System.out.println(aa);*/
        Object[] o11=new Object[19];
       /*for (Map.Entry<String, String> entry : m1.entrySet())
{
                    entry.getValue();
}
*/
    Iterator i1=m2.iterator();
    int k=0;
    while(i1.hasNext()&&k<19)
    {
        o11[k]=m1.get(i1.next());
        k=k+1;
    }
    for(int p=0;p<o11.length;p++)
    {
        System.out.println(o11[p]);
    }
     Collection<String> s = m1.values();
     ArrayList<String> a11 = new ArrayList<String>(s);
     System.out.println(a11);
     System.out.println(set12.subSet("sid1","sid5"));
     
          }
    
     
}
