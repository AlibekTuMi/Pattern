package View;

import java.util.Scanner;

import Calculate.Interface.iGetview;

public class ViewClass implements iGetview {

    @Override
    public String getInputNumOne() {
        System.out.println("\nВведите первое число");
        return "";
    }

    @Override
    public String prompt(String msg) {
        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public String getCommandSign() {
        System.out.println("Какое действие вы хотите совершить:");
        System.out.println("Сложить: +\nВычесть: -\nУмножить: *\nДелить: /\n");
        return "";
    }

    @Override
    public String errorMsg() {
        return "Ошибка ввода, повторите запрос!!!";
    }

    @Override
    public String exitMsg() {
        return "Программа закрывается!!!";
    }

    @Override
    public String getInputNumTwo() {
        System.out.println("Введите второе число");
        return "";
    }

    @Override
    public String questionMsg() {
        return "\nВведите 1 для работы с одним комплексным числом\nВведите 2 для работы с двумя комплексными числами\nЧтобы выйти из программы введите 3\n";
    }

    @Override
    public String welcome() {
        return "Приветствую!!!\nЭто калькулятор комплексных чисел\nПрограмма ждёт от вас команды\n";
    }

    @Override
    public String nameFile() {
        return "Введите название файла с его форматом, в который будут сохраняться данные!(пример text.txt)";
    }

}
