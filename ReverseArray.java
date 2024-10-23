public class ReverseArray{
    public static void main(String [] args){
        int [] array = {10,20,30,40,50};
        reverseArray(array);
        for (int num : array){
            System.out.print(num + " ");
        }
    }
    
    public static void reverseArray(int [] array){
        int left = 0;
        int right = array.length - 1;
        while (left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}