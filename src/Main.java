import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> itemList = new ArrayList<>();


        while (true) {
            System.out.println("Выберите операцию:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);


            if (number == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String item = scanner.nextLine();
                itemList.add(item);
                System.out.println("Итого в списке покупок: " + itemList.size());
            }


            if (number == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < itemList.size(); i++) {
                    System.out.println((i + 1) + ". " + itemList.get(i));
                }
            }

            if (number == 3) {
                System.out.println("Список покупок:");
                for (int i = 0; i < itemList.size(); i++) {
                    System.out.println((i + 1) + ". " + itemList.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                String itemRemover = scanner.nextLine();
                try {
                    int itemNumber = Integer.parseInt(itemRemover);
                    itemList.remove(itemNumber - 1);
                } catch (Exception e) {
                    itemList.remove(itemRemover);
                }


            }


        }
    }
}

