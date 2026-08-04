import java.util.Scanner;
import java.util.HashMap;
class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int Int_val = 0;
        for(int i =0; i<s.length();i++){
            if(i<s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                Int_val -= map.get(s.charAt(i));
            }else{
                Int_val += map.get(s.charAt(i));
            }
        }
        return Int_val;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number : ");
        String Roman = sc.nextLine().toUpperCase();
        int Int_val = romanToInt(Roman);
        System.out.println("The Equivalent Integer value of " + Roman + " is " + Int_val);
        sc.close();
    }
}