import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        digits.add(5);
        digits.add(4);
        digits.add(2);
        digits.add(7);
        digits.add(6);
        System.out.println(digits);
        removeEvenNumber(digits);
        System.out.println(digits);
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 0; i < numbers.size(); i += 2) {
            numbers.remove(numbers.get(i));
            i--;
        }

    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer.parseInt(strings.get(i));
                strings.remove(strings.get(i));
                i--;
                } catch (NumberFormatException e) {
                    continue;
                }
        }
    }
}