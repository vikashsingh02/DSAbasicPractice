public class pairs {
    public static void main(String[] args) {
        int tp =0;
        int arr[] ={2,4,6,8,10 };
        for(int i=0;i<arr.length;i++){ //2,4,6,,8,10
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" +curr+","+ arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are :"+ tp);
    }
}
