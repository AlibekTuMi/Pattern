package Calculate;

import java.sql.Date;
import java.text.SimpleDateFormat;
import Calculate.Interface.iGetmodel;
import Calculate.Interface.iGetview;
import Model.RecordingActions;

public class CalculateClass {
    private iGetmodel model;
    private iGetview view;
    
/**
 * Конструктор
 * @param model - интерфейс iGetmodel
 * @param view - интерфейс iGetview
 */
    public CalculateClass(iGetmodel model, iGetview view) {
        this.model = model;
        this.view = view;
        
    }

    public void run() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z"); // импортировал библиотеку SimpleDateFormat, 
        // которая будет прописывать дату в определенном формате.
        Date date = new Date(System.currentTimeMillis()); // импортировал библиотеку Date, которая будет сохранять в себе время, при которой она вызывается
        System.out.println(view.welcome());// Приветствие
        String nameFile = view.prompt(view.nameFile());//ввод названия файла
        RecordingActions recordingActions = new RecordingActions(nameFile);
        recordingActions.recordStr(String.format("Начальное время работы с программой - %s", formatter.format(date)));
        boolean inter = true;
        while (inter) {
            String questionMsg = view.prompt(view.questionMsg());//выбор пункта меню
            switch (questionMsg) {
                case "1":
                    recordingActions.recordStr(
                            String.format("Выбрана команда %s, работаем с одним комплексным числом.", questionMsg));
                    String one1 = view.prompt(view.getInputNumOne());
                    recordingActions.recordStr("Введена цифра " + one1);
                    String two1 = view.prompt(view.getInputNumTwo());
                    recordingActions.recordStr("Введена цифра " + two1);
                    int newOne1 = Integer.parseInt(one1);
                    int newTwo1 = Integer.parseInt(two1);
                    String question1 = view.prompt(view.getCommandSign());
                    boolean i = true;
                    while (i) {
                        switch (question1) {
                            case "+":
                                recordingActions.recordStr("выбрана команда +");
                                System.out.println(model.plusNum(newOne1, newTwo1));                               
                                break;
                            case "-":
                                recordingActions.recordStr("выбрана команда -");
                                System.out.println(model.minusNum(newOne1, newTwo1));                                
                                break;
                            case "*":
                                recordingActions.recordStr("выбрана команда *");
                                System.out.println(model.multiplyNum(newOne1, newTwo1));                                
                                break;
                            case "/":
                                recordingActions.recordStr("выбрана команда /");
                                System.out.println(model.shareNum(newOne1, newTwo1));                               
                                break;
                            default:
                                System.out.println(view.errorMsg());
                                recordingActions.recordStr(view.errorMsg());
                                break;
                        }
                        i = false;    
                    }
                    continue;

                case "2":
                    recordingActions.recordStr(
                            String.format("Выбрана команда %s, работаем с двумя комплексными числами.", questionMsg));
                    String one = view.prompt(view.getInputNumOne());
                    recordingActions.recordStr("Введена цифра " + one);
                    String two = view.prompt(view.getInputNumTwo());
                    recordingActions.recordStr("Введена цифра " + two);
                    int newOne = Integer.parseInt(one);
                    int newTwo = Integer.parseInt(two);
                    String question2 = view.prompt(view.getCommandSign());
                    switch (question2) {
                        case "+":
                            recordingActions.recordStr("выбрана команда +");
                            String threePlus = view.prompt(view.getInputNumOne());
                            recordingActions.recordStr("Введена цифра " + threePlus);
                            String fourPlus = view.prompt(view.getInputNumTwo());
                            recordingActions.recordStr("Введена цифра " + fourPlus);
                            int newThreePlus = Integer.parseInt(one);
                            int newFourPlus = Integer.parseInt(two);
                            recordingActions.recordStr(model.plusNumbers(newOne, newTwo, newThreePlus, newFourPlus));
                            System.out.println(model.plusNumbers(newOne, newTwo, newThreePlus, newFourPlus));
                            break;
                        case "-":
                            recordingActions.recordStr("выбрана команда -");
                            String threeMinus = view.prompt(view.getInputNumOne());
                            recordingActions.recordStr("Введена цифра " + threeMinus);
                            String fourMinus = view.prompt(view.getInputNumTwo());
                            recordingActions.recordStr("Введена цифра " + fourMinus);
                            int newthreeMinus = Integer.parseInt(one);
                            int newfourMinus = Integer.parseInt(two);
                            recordingActions.recordStr(model.minusNumbers(newOne, newTwo, newthreeMinus, newfourMinus));
                            System.out.println(model.minusNumbers(newOne, newTwo, newthreeMinus, newfourMinus));
                            break;
                        case "*":
                            recordingActions.recordStr("выбрана команда *");
                            String threeMulti = view.prompt(view.getInputNumOne());
                            recordingActions.recordStr("Введена цифра " + threeMulti);
                            String fourMulti = view.prompt(view.getInputNumTwo());
                            recordingActions.recordStr("Введена цифра " + fourMulti);
                            int newthreeMulti = Integer.parseInt(one);
                            int newfourMulti = Integer.parseInt(two);
                            recordingActions.recordStr(model.multiplyNumbers(newOne, newTwo, newthreeMulti, newfourMulti));
                            System.out.println(model.multiplyNumbers(newOne, newTwo, newthreeMulti, newfourMulti));
                            break;
                        case "/":
                            recordingActions.recordStr("выбрана команда /");
                            String threeShare = view.prompt(view.getInputNumOne());
                            recordingActions.recordStr("Введена цифра " + threeShare);
                            String fourShare = view.prompt(view.getInputNumTwo());
                            recordingActions.recordStr("Введена цифра " + fourShare);
                            int newthreeShare = Integer.parseInt(one);
                            int newfourShare = Integer.parseInt(two);
                            recordingActions.recordStr(model.shareNumbers(newOne, newTwo, newthreeShare, newfourShare));
                            System.out.println(model.shareNumbers(newOne, newTwo, newthreeShare, newfourShare));
                            break;
                        default:
                            recordingActions.recordStr(view.errorMsg());
                            view.errorMsg();
                            break;
                    }
                    continue;
                case "3":
                    recordingActions.recordStr("Выбрана команда 3\n" + view.exitMsg());
                    System.out.println(view.exitMsg());
                    inter = false;
                    break;
                default:
                    recordingActions.recordStr(view.errorMsg());
                    System.out.println(view.errorMsg());
                    break;
            }
        }
    }
}
