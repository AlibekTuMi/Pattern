import Calculate.CalculateClass;
import Calculate.Interface.iGetmodel;
import Calculate.Interface.iGetview;
import Model.Decorator;
import Model.ModelClass;

import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {
        iGetview viewClass = new ViewClass(); //Создал интерфейс iGetview со строковыми функциями, также создал класс ViewClass, имплементирующий iGetview и переопределил все функции

        iGetmodel modelClass = new ModelClass(); //Создал интерфейс iGetmodel со строковыми функциями, также создал класс ModelClass, имплементирующий iGetview и переопределил все функции,
        // в которых проработал логику каждого метода калькулятора

        Decorator decorator = new Decorator(modelClass); // Создал отдельный класс, который можно поставить в качестве аргумента в CalculateClass вместо любого из аргументов. 
        // Этот класс работает как оформление выходных данных на терминале

        CalculateClass calculateClass = new CalculateClass(modelClass, viewClass); // Основной класс, в котором проходят все операции
        calculateClass.run();
    }
}
