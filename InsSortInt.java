import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class InsSortInt {
    public static void main(String[] args){
        File myObj = new File("randInts.txt");
        ArrayList<String> arr = new ArrayList<String>();
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()) {
            if (scanner.hasNext()) {
            arr.add(scanner.nextLine());
            }
        }
        scanner.close();
        Integer nums[] = new Integer[arr.size()];
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(arr.get(i));
        }
        System.out.println(nums);
    }


}
