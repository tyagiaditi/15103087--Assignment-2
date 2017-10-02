
public class AllLengthStrings {
		 
	    public static void main(String[] args) {             
	        int k;
	        char set[] = {'a', 'a', 'c', 'e'};
	        for(int i=1;i<=set.length;i++){
	        k = i;
	        printAllLengthRec(set,"",set.length,k); }       
	    }    
	
	 
	     static void printAllLengthRec(char set[], String prefix, int n, int k) {
	        if (k == 0) {
	            System.out.println(prefix);
	            return;
	        }
	        for (int i = 0; i < n; ++i) { 
		        String newPrefix = prefix + set[i]; 
	            printAllLengthRec(set, newPrefix, n, k - 1); 
	        }
	    }
	}
