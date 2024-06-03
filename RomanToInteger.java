import java.util.*;
public class RomanToInteger {
    public static int converter(String s){
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for(int i = s.length()-1; i>=0; i--){
            char currentChar = s.charAt(i);
            int currentValue = romanToIntMap.get(currentChar);
            if (currentValue < prevValue) {
                sum -= currentValue;
            }
            else{
                sum += currentValue;
            }

            prevValue= currentValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roman number:");
        String roman = scan.next();
        int result = converter(roman);
        System.out.println(roman + " is equal with " + result);
        scan.close();
    }
}
