import java.util.ArrayList;
import java.util.Scanner;

public class CountChar {
    private ArrayList<Character> characterArrayList;
    private ArrayList <Integer> quantity;


    public static void main(String[] args) {

        Scanner textReader = new Scanner(System.in);
        System.out.println("Your Input: ");
        String text = textReader.nextLine();
        String textWithoutNumbers = text.replaceAll("\\d+", "");
        new CountChar(textWithoutNumbers);

    }

    private CountChar(String text){
        count(text);
        printResult();
    }

    private void printResult(){
        for(Character i: characterArrayList){
            System.out.println(i + " : " + quantity.get(characterArrayList.indexOf(i)));
        }
    }

    private void count(String text){
        characterArrayList = new ArrayList();
        quantity = new ArrayList<>();

        System.out.println("Original String: " + text);

        for (Character i: text.toCharArray()){
            i = Character.toLowerCase(i);
            if(i != ' ' ){
                if (!characterArrayList.contains(i)) {
                    characterArrayList.add(i);
                    quantity.add(1);
                }
                else {
                    int index = characterArrayList.indexOf(i);
                    quantity.set(index, quantity.get(index) + 1);
                }
            }
        }
    }
}
