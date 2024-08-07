public class smallestMultiple {

    public static void main (String[] args){

        int smallMult = 0;

        for(int i = 21; i <=  2147483647; i ++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    if(j == 20){
                        smallMult = i;
                    }
                    continue;
                }else
                {
                    break;
                }

            }

            if(smallMult != 0){
                break;
            }
        }

        StdOut.print(smallMult);


    }

}
