import java.util.*;
public class BEraseFirstOrSecondLetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
        int n=sc.nextInt();
        String s=sc.next();
        int []freq=new int[26];
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']==1){
                count++;
                ans+=count;
            }
            else{
                ans+=count;
            }
        }
    System.out.println(ans);
    }}

}