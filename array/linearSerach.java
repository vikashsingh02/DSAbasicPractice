public class linearSerach {
    public static int search(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,4,6,3,5,8,12};
        int key = 12;
         int index = search(num, key);
         if(index==-1){
            System.out.println("key not fopund");
           
         }
         else{
            System.out.println("key is at :" + index);
         }
    }
}
