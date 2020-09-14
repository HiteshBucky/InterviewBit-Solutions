package String;

/**
 * Author - archit.s
 * Date - 06/10/18
 * Time - 2:14 PM
 */
public class CompareVersions {
    public int compareString(String a, String b){
		return new BigInteger(a).compareTo(new BigInteger(b));
	}
    
    public int compareVersion(String A, String B) {
        String a[] = str1.split("[.]");     //Split the number 1.12.3 -> [1,12,3]
        String b[] = str2.split("[.]");

        int i = 0;                          //Start Comparing from left af the array one by one if both element is diff, then return accordingly
        for(; (i<a.length && i<b.length); i++){     
            if(compareString(a[i], b[i])>0) return 1;
            if(compareString(a[i], b[i])<0) return -1;					
        }                                   
        for(int j = i; j<a.length; j++)         // case :  A[1,23,23], B[1,23,23,4] just check last number that were not checked earlier
            if(Integer.valueOf(a[i]) != 0) return 1;
        
        for(int j = i; j<b.length; j++)         //case : A[1,23], B[1]
            if(Integer.valueOf(b[i]) != 0) return -1;
        
        return 0;    
    }

    public static void main(String[] args) {
        System.out.println(new CompareVersions().compareVersion("01", "1"));
        System.out.println(2147483647);
    }

}
