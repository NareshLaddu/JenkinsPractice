import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 List<String> l1=new ArrayList<>();
		   List <String> l2 =new ArrayList<>();
		 l1.add("Naresh");
		 l1.add("Indhumathi");
		 l1.add("Dakshit");
		 l1.add("Charishma");
		 l1.add("Kumar");
		 
		 l1.add("Pratibha");
		 l2.addAll(l1);
		 
		 Iterator<String> itr=l1.iterator();
		
		 while(itr.hasNext())
		{
		 System.out.println(itr.next());
		}
		 System.out.println("***********************************************");
		 if(l2.contains("Kumar"))
		 {
		 l2.set(4, "Raju");	
		 }
		 for(int i=0;i<l2.size();i++)
		 {
			 System.out.println(l2.get(i));
		 }
		 
//		 l1.remove(5);
//		 l1.remove(4);
		//l2.removeAll(l2);
		String [] arr = new String[l1.size()];
	        l1.toArray (arr);
		 System.out.println("**********************************************");
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.println(arr[i]);
			// System.out.println(itr.next());
		 }
	}

}
