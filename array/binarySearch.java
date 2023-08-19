public class binarySearch {
    public static int search(int num[],int key){
        int start =0,end= num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparsion
            if(num[mid]==key ){
                return mid;
            }
            if(num[mid]<key){ //right
                start=mid+1;

            }
            else {
                end =mid-1; //left
            }
            
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int key = 55;
        System.out.println("key found is"+ search(num, key));
      
    }

        
    }