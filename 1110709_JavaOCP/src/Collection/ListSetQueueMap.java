package Collection;
/*Collection(集合):
 * 1.就是在收集資料,有排序規則。
 * 2.是可以無限制增加數量的陣列。
 * 3.Data Structure(資料結構)--->method要好方向。
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;



public class ListSetQueueMap {

	public static void main(String[] args) {
		
       /* 一般Array有排序,但有需限定長度。 */
		int[]a1=new int[3];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		for (int pa:a1) {System.out.println(pa);}
		
		System.out.println("============== List ==================");
		
		/* List --->ArrayList:跟Array一樣有【索引順序】，但資料【重複】(照原本順序)，可自動延長度。 */
		ArrayList <Integer>x1=new ArrayList<>();
		x1.add(11);
		x1.add(22);
		x1.add(00);
		x1.add(00);
		for(int px:x1){System.out.println(px);}
		
		System.out.println("=============== Set ===================");
		
		/* *
		 * Set:資料【不重複】。
		 * --> HashSet:【隨機】排序。
		 * --> TreeSet: 重新排序，【可訂排序】規則。
		 *  */
		
		/* HashSet */
		HashSet<Integer>hs=new HashSet<>();
		hs.add(33);
		hs.add(66);
		hs.add(11);
		hs.add(11);
		for(int phs:hs) {System.out.println(phs);}
		
		/* TreeSet */
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(33);
		ts.add(66);
		ts.add(11);
		ts.add(11);
		for(int pts:ts) {System.out.println(ts);}
		
		System.out.println("=============== Queue ====================");
		
		/* Queue:二元樹排序 --->priorityQueue資料可【重覆】，有【排序】。 */
		PriorityQueue<Integer> pq =new PriorityQueue<>();		pq.add(33);
		pq.add(66);
		pq.add(11);
		pq.add(11);
		for(int ppq:pq) {System.out.println(ppq);}
		
		System.out.println("=============== Map =======================");
		/**
		 * Map<k,v>: k:為key使用Set規則(不重複) , v:為value就是key的值。
		 * --->HashMap<k,v>:key【不重複】+【隨機】排序。
		 * --->TreeMap<k,v>:key【重複】+【有排序】。  
		 * */
		
		/*HashMap*/
		HashMap<String, Integer>hm=new HashMap<>();
		hm.put("Tess",166);
		hm.put("芸兒",166);
		hm.put("饅頭",167);
		hm.put("路人",160);
		hm.put("路人",170);
		System.out.println(hm);
		
		/*TreeMap*/
		TreeMap<String, Integer>tm=new TreeMap<>();
		tm.put("Tess",166);
		tm.put("芸兒",166);
		tm.put("饅頭",167);
		tm.put("路人",160);
		hm.put("路人",170);
		System.out.println(tm);
		
		
		
		
		
		

		
	}

}
