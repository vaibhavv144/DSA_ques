package Arrays_ques;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 3, 4, 4, 6, 5};

        int sL = snd_lar(arr);
         int sS=snd_sml(arr);
        System.out.println(sL);
        System.out.println(sS);
    }

    private static int snd_lar(int[] arr) {
        int larg = arr[0];
        int snd_larg = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg) {
                snd_larg = larg;
                larg = arr[i];

            } else if (arr[i] < larg) {
                if (arr[i] > snd_larg) {
                    snd_larg = arr[i];
                }
            }

        }
        return snd_larg;

    }

        private static int snd_sml(int[] arr){
            int smll=arr[0];
            int s_smll=Integer.MAX_VALUE;

            for(int i=1;i<arr.length;i++){
                if(arr[i]<smll){
                    s_smll=smll;
                    smll=arr[i];
            }
                else if (arr[i] >smll) {
                    if (arr[i] < s_smll) {
                        s_smll = arr[i];
                    }
                }
        }
            return s_smll;

        }
    }
