package View;

import java.util.Scanner;

import Calculate.Interface.iGetview;

public class ViewClass implements iGetview {
private boolean exit = true;
    @Override
    public String getInputNumOne() {
        return "Введите первое число";
    }

    @Override
    public String prompt(String msg) {
        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        if (!exit) {
            in.close();
        }
        return in.nextLine();
    }

    @Override
    public String getCommandSign() {
        return "Какое действие вы хотите совершить:\nСложить: +\nВычесть: -\nУмножить: *\nДелить: /";
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
        return "Введите второе число";
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
