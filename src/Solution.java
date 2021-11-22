import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самая длинная строка

Задание:
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длинной, равной максимальной, то нужно вывести каждую из них с новой строки.
 */
public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        strings = new ArrayList<String>();  //(п.1)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //(п.2)
        for(int i = 0; i < 5; i++) {    //(п.2)
            String name = reader.readLine();
            strings.add(name);
        }
        int largestStr = strings.get(0).length();
        for(int j = 0; j < strings.size(); j++) {   //(п.3)
            if(strings.get(j).length() > largestStr) {
                largestStr = strings.get(j).length();
            }
        }
        for(int k = 0; k < strings.size(); k++) {   //(п.3, п.4)
            if(strings.get(k).length() == largestStr) {
                System.out.println("Самая длинная строка(и), это - " + strings.get(k));
            }
        }
        //to here
    }
}
