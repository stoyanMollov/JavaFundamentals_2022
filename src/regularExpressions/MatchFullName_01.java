package regularExpressions;

import java.io.StringBufferInputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        List<String> names = new ArrayList<>();
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
        Collections.sort(names);
        names.forEach(System.out::println);
            
    }
}

