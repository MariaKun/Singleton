import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка \nВведите размер списка:");
        int count = scanner.nextInt();

        logger.log("Введите верхнюю границу для значений:");
        int max = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arrayList.add(random.nextInt(max));
        }
        logger.log("Вот случайный список:" + arrayList.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра:");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(arrayList);

        logger.log("Выводим результат на экран\n" +
                "Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}