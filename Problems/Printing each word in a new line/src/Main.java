import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while(scanner.hasNext()){
            words.add(scanner.next());
        }

        for(String word : words){
            System.out.println(word);
        }

    }
}