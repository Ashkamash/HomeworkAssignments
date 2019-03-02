package section020.assign1;

public class Assign1{
    public static void main(String[] args){
        double[] intArray = {1,4,89,100};
        double sum = 0;
        for (int i = 0; i < (intArray.length); i++){
            double valueCurrent = intArray[i];
            sum = (valueCurrent + sum);
        }
        double avg = (sum/intArray.length);
        //double avg = ((intArray[0] + intArray[1]+intArray[2]+intArray[3])/intArray.length);
        System.out.println(avg);
    }
}