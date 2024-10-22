package practise_acc;

public class sum_of_nbr_in_string {
    public static void main(String[] args) {
        String str="ab34vb3";

        char[]arr=str.toCharArray();
        int sum=0;
        int num=0;
//        for(int i=0;i<arr.length;i++){
//            if()
//            num=arr[i]-'0';
//            sum=sum+num;
//        }
        for(Character ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                System.out.println(ch);

            }
            else{
                System.out.println(ch);
                sum=sum+num;
                num=0;
            }
        }
        sum=sum+num;
        System.out.println(sum);
    }
}
