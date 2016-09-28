import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args){
		//int[] a={1,2,3};
		ArrayList<Integer> set=new ArrayList<Integer>();
		set.add(1);set.add(2);set.add(3);
		ArrayList<ArrayList<Integer>> allsets=getSubsets(set,0);
		System.out.println(allsets);
		//System.out.println(findI(a));
	}
	
//return all subsets of a set

	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		
		if(set.size()==index){
			allsubsets=new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}else{
			allsubsets=getSubsets(set,index+1);//allsubsets=null,3
			int item=set.get(index);//item=2
			ArrayList<ArrayList<Integer>> moresubsets=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){//subset=null then 3
				ArrayList<Integer> newsubset=new ArrayList<Integer>();
				newsubset.addAll(subset);//newsubset=null//newsubset=3
				newsubset.add(item);//newsubset=2//newsubset=32
				moresubsets.add(newsubset);//moresubset=2//moresubset=2,32
			}
			allsubsets.addAll(moresubsets);//null,3,2,32
		}
		return allsubsets;
	}
}
