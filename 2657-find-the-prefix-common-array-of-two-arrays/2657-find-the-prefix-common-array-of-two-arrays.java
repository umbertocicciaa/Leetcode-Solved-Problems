class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        List<Integer> res=new ArrayList<Integer>();
        int counter=0;
        do{
            int numeriUguali=0;
            for(int i=0; i<A.length && i<=counter; i++){
                for(int j=0;j<B.length && j<=counter;++j){
                    if (A[i]==B[j])
                        numeriUguali++;
                }
            }
            res.add(numeriUguali);
            counter++;
        }while(counter<A.length);
        int[] arr = new int [res.size()];
        for(int i=0;i<arr.length;i++)
            arr[i]=res.get(i);
        return arr;
    }
}