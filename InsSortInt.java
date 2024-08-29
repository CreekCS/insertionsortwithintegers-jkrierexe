import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main(String[] args) throws FileNotFoundException{
        File myObj = new File("randInts.txt");
        ArrayList<String> arr = new ArrayList<String>();
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()) {
            arr.add(scanner.nextLine());
        }
        scanner.close();
        Integer nums[] = new Integer[arr.size()];
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(arr.get(i));
        }
        InsertionSort(nums);
        System.out.println("Smallest: " + nums[0] + " - Largest: " + nums[nums.length-1]);
        
    }
    public static Integer[] InsertionSort(Integer[] nums){
        for(int i=1; i<nums.length-1; i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}
