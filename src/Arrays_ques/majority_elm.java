package Arrays_ques;

public class majority_elm {

    //you have to return the element that appears >N/2 times in an array
    //brute force is go on travesing whole array and chk for elemet do count++ if that count goes > N/2 than tha is majority elem

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 2, 1, 12, 2, 2};
        int N = arr.length;

        //brute force
//        for(int i=0;i<arr.length;i++){
//            int count=0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//                if(count>N/2){
//                    System.out.println(arr[j]);
//                }
//            }
//        }

        //most optimized approach is using moore voting algo isme phle elemnt ko lenge ar traverse karenge agar same element
        //mil rha to count++ wrna count-- jaha par count==0 hogaa wha ye assure hoga ki koi bhi abhi tk majority nhi h phr 0 cnt hone ke
        //baad phr se aage k element ko lenge ar same process repeat agr last tk koi elemet bacha jiska cnt>0 hogaa mtlb ki ye majority hoskta h
        //phr hmlog ek loop laga k chk kr lenge ki wo element kitni baar occur kr rha h

        int cnt = 0;
        int ele = 0;
        for (int i = 0; i < N; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == ele) cnt1++;
        }
        if (cnt1 > (N / 2)) {
            System.out.println(ele);
        }
    }
}
