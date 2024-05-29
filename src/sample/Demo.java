package sample;

public class Demo {
	public static void main(String[] args) {
//		System.out.println("Hello");
//		System.out.println("Welcome");
//		String s = "Ram";
//		System.out.println(s.charAt(0));
//		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
//		int k = 30;
//		 String smallest = "";
//	        String largest = "";
//	        int ite = (s.length()+1)-k;
//	        // Complete the function
//	        // 'smallest' must be the lexicographically smallest substring of length 'k'
//	        // 'largest' must be the lexicographically largest substring of length 'k'
//	        String[] words = new String[ite];
//	        for(int i=0;i<=ite-1;i++){
//	            words[i] = (s.substring(i,i+k));
//	        }
//	        smallest = words[0];
//	        largest = words[0];
//	        for (String word : words) {
//	        	System.out.println("----------"+word);
//	            if(word.charAt(0)<smallest.charAt(0)){
//	                smallest = word;
//	            }
//	            if(word.charAt(0)==smallest.charAt(0)&& word.length()>1) {
//	            	for(int i=0;i<word.length();i++) {
//	            		if(word.charAt(i)<smallest.charAt(i)) {
//	            			smallest = word;
//	            			break;
//	            		}
//	            		else if(word.charAt(i)!=smallest.charAt(i)) {
//	            			break;
//	            		}
//	            	}
//	            }
//	            if(word.charAt(0)>largest.charAt(0)){
//	                largest = word;
//	            }
//	            if(word.charAt(0)==largest.charAt(0)&& word.length()>1) {
//	            	for(int i=0;i<word.length();i++) {
//	            		System.out.println("word.charAt(i): "+word.charAt(i)+"----"+"largest.charAt(i): "+largest.charAt(i));
//	            		if(word.charAt(i)>largest.charAt(i)) {
//	            			largest = word;
//	            			break;
//	            		}
//	            		else if(word.charAt(i)!=largest.charAt(i)) {
//	            			break;
//	            		}
//	            	}
//	            }
//	        }
//	        System.out.println(smallest + "\n" + largest);
		
		String A="madam";
        String result = "No";
        String a = "";
        for(int i=A.length()-1;i>=0;i--){
            a += A.charAt(i);
        }
        System.out.println(A.hashCode());
        System.out.println(a.hashCode());
        System.out.println(a);
        if(A.equals(a)){
            result = "Yes";
        }
        System.out.println(result);
	}
}
