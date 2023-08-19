
public class smallestNumber {
    public static int largestNumber(int num[]){
         int smallest =  Interger .MAX_VALUE;
        int biggest =  Interger .MIN_VALUE;
       
       for(int i=0;i<num.length;i++){
            if(biggest < num[i]){
                biggest = num[i];
            }
             if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest number is "+ smallest);
        return biggest;
        }
    public static void main(String[] args) {
        int num[] ={1,5,4,8,7,6};
        System.out.println("the largesr num is "+ largestNumber(num));
    }
    
}
