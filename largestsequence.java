public class largestsequence
{
	public static void main(String[] args) {
	    String s="abcde";
	    String s1="ad";
	    int m=s.length();
	    int n=s1.length();
	    int [][]a=new int[m+1][n+1];
	    for(int i=m-1;i>=0;i--)
	    {
	        for(int j=n-1;j>=0;j--)
	        {
	            if(s.charAt(i)==s1.charAt(j))
	            {
	                a[i][j]=1+a[i+1][j+1];
	            }
	            else{
	                a[i][j]=Math.max(a[i][j+1],a[i+1][j]);
	            }
	        }
	    }
		System.out.println(a[0][0]);
	}
}