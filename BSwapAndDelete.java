import java.util.*;
public class BSwapAndDelete{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            String s=sc.next();
            int ones=0,zeroes=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    ones++;
                }
                else{
                    zeroes++;
                }
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    if(zeroes>0){
                        zeroes--;
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(ones>0){
                        ones--;
                    }
                    else{
                        break;
                    }
                }
            }
            int sum=zeroes+ones;
        System.out.println(sum);
        }
    }
}