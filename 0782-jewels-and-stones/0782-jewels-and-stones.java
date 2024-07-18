import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jSet = new HashSet<String>();
        Map<String, Integer> sMap = new HashMap<String, Integer>();

        int result=0;

        String[] jewel = jewels.split("");
        String[] stone = stones.split("");

        for(int i=0; i<jewel.length; i++){
            jSet.add(jewel[i]);
        }

        for(int i=0; i<stone.length; i++){
            sMap.put(stone[i],sMap.get(stone[i])==null?1:sMap.get(stone[i])+1);
        }
        
        Iterator iter = jSet.iterator();
        while(iter.hasNext()) {
        	String j = (String)iter.next();
        	//System.out.println(j);
            //System.out.println(sMap.get(j));
            result += (int)(sMap.get(j)==null?0:sMap.get(j));
            
        }
        return result;
    }
}