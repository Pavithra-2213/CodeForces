import java.util.*;
public class CQuests{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
        int sum=0,maxi_b=0,ans=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<Math.min(k,n);i++){
            sum+=a[i];
            maxi_b=Math.max(maxi_b,b[i]);
            ans=Math.max(ans,sum+(k-i-1)*maxi_b);
        }
        System.out.println(ans);
        }
        
    }
}