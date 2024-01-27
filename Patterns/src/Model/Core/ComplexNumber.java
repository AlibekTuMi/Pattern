package Model.Core;
public class ComplexNumber {
    private Character sign = 'i';
    private int oneNum;
    private int twoNum;
    private String complexNumber = new String();

    /**
     * Конструктор комплексного числа
     * @param oneNum - первое число
     * @param twoNum - второе число
     */
    public ComplexNumber(int oneNum, int twoNum) {
        this.oneNum = oneNum;
        this.twoNum = twoNum;

        // в этих условиях проверяется логическое написание комплексного числа 
        if (twoNum<0) {
            if (twoNum==-1) {
                complexNumber+=oneNum+ "-" + sign;
            }
            else complexNumber+=oneNum+ "" + twoNum + sign;
        }
        
        else{
            if (twoNum==1) {
                complexNumber+=oneNum+ "+" + sign;
            }
            else complexNumber+=oneNum+ "+" + twoNum + sign;
        }
    }

   //метод возвращает первое число из комплексного числа
    public int getOneNum() {
        return oneNum;
    }

    //метод возвращает второе число из комплексного числа
    public int getTwoNum() {
        return twoNum;
    }

    // метод возвращает комплексное число
    @Override
    public String toString() {
        return complexNumber;
    }
    
}
