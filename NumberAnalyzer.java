
import java.io.*;
import java.util.*;

public class NumberAnalyzer {
    public static void main(String[] args) {
        String filePath = "numbers.txt"; 
        try {
            List<Integer> numbers = readNumbersFromFile(filePath);
            System.out.println(_min(numbers));
            System.out.println(_max(numbers));
            System.out.println(_sum(numbers));
            System.out.println(_mult(numbers));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        reader.close();
        String[] numberStrings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String number : numberStrings) {
            numbers.add(Integer.parseInt(number.trim()));
        }
        return numbers;
    }

    public static int _min(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int _max(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int _sum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static long _mult(List<Integer> numbers) {
        long product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}
