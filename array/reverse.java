public class reverse {
    public static void  rev(int num[]){
        int first =0, last = num.length -1;
        while(first<last){ //first is less then last
         int temp = num [last];
        num[last]= num [first]; 
        num [first] =  temp;
        first++;
        last --;
         }
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5,6};
        rev(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");

        }
        System.out.println();
       
    }
}
