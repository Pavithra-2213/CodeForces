import java.util.*;
public class CRaspberries{
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%k==0)a[i]=a[i]+1;
            count++;
        }
        System.out.println(count);
    }
        System.out.println(count);
    }
}