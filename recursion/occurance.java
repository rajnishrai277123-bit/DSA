public class occurance{
    public static int postion(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return postion(arr,key,i+1);
    }
    public static void main(String[] args){
        int arr[]={2,3,6,7,6,8};
        System.out.println(postion(arr,6,0));

    }
}