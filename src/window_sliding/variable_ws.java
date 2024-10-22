package window_sliding;
//sliding ke ques me ek array dia hoga  ek value k di hogi uspe cond hogi ar output m array ya substring nikalni hogi
public class variable_ws {
    public static void main(String[] args) {
        //given an array and an int k return no of contiguous sub array where product of all element is strictly less than k
        //here we take 2 pointer s and e and then increase e accrding to condition
        int[]nums={1,2,3,4,5,6,7};
        int k=12;
        int s=0;
        int e=0;
        int p=1;
        int ans=0;

        //window growth yha add honge elements window m
        while(e<nums.length){
            p=p*nums[e];

            //window shrinking tab tk shrinnk hoga jbtk product less than k na ho
            while(p>=k&&e>=s){
                p=p/nums[s];
                s++;
            }

            //answer calculation
            ans=ans+e-s+1;//yha window size add  hoga(s-e+1)
            e++;

        }
        System.out.println(ans);
    }
    }

