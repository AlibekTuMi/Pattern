package Model;

import java.io.FileWriter;

public class RecordingActions {
    private String fileName;
    /**
     * Конструктор для создания файла
     * @param fileName - название файла
     */
    public RecordingActions(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // метод записывает в созданный файл вложенную в него строковую переменную
    public void recordStr(String file) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(file);
            fw.append('\n');
            fw.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
