public class menu {
    public static int search( String items[], String key){
        for(int i=0;i<items.length;i++){
            if(items[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String items[] ={"fruti","chai","choly","chawal","rajma","samosa"};
         String key = "samosa";
         int index = search(items, key);
         if(index==-1){
            System.out.println(" not found");
           
         }
         else{
            System.out.println("item  no is :" + index);
         }
    }
}
