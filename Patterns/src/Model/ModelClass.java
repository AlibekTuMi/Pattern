package Model;

import Calculate.Interface.iGetmodel;
import Model.Core.ComplexNumber;

public class ModelClass implements iGetmodel {

    //метод возвращает сумму 2 комплексных чисел
    @Override
    public String plusNumbers(int a, int b, int c, int d) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        ComplexNumber complexNumber2 = new ComplexNumber(c, d);
        return String.format("(%s)+(%s)=%s", complexNumber1, complexNumber2,
                new ComplexNumber(complexNumber1.getOneNum() + complexNumber2.getOneNum(),
                        complexNumber1.getTwoNum() + complexNumber2.getTwoNum()));

    }

    //метод возвращает разность двух комплексных чисел
    @Override
    public String minusNumbers(int a, int b, int c, int d) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        ComplexNumber complexNumber2 = new ComplexNumber(c, d);
        if (complexNumber2.getOneNum() < 0) {
            return String.format("%s-(%s)=%s", complexNumber1, complexNumber2,
                    new ComplexNumber(complexNumber1.getOneNum() - complexNumber2.getOneNum(),
                            complexNumber1.getTwoNum() - complexNumber2.getTwoNum())); // третье -
        } else if (complexNumber2.getTwoNum() < 0) {
            return String.format("%s-%s=%s", complexNumber1, complexNumber2,
                    new ComplexNumber(complexNumber1.getOneNum() - complexNumber2.getOneNum(),
                            complexNumber1.getTwoNum() + complexNumber2.getTwoNum())); // четвертое -
        } else if (complexNumber2.getOneNum() < 0 && complexNumber2.getTwoNum() < 0) {
            return String.format("%s%s=%s", complexNumber1, complexNumber2,
                    new ComplexNumber(complexNumber1.getOneNum() + complexNumber2.getOneNum(),
                            complexNumber1.getTwoNum() + complexNumber2.getTwoNum())); // оба -
        } else if (complexNumber2.getOneNum() == complexNumber1.getOneNum()
                && complexNumber2.getTwoNum() == complexNumber1.getTwoNum()) {
            return "0 - 0i";
            
        } else {
            return String.format("%s-(%s)=%s", complexNumber1, complexNumber2,
                    new ComplexNumber(complexNumber1.getOneNum() - complexNumber2.getOneNum(),
                            complexNumber1.getTwoNum() - complexNumber2.getTwoNum()));
        }
    }

     //метод возвращает частное  двух комплексных чисел
    @Override
    public String shareNumbers(int a, int b, int c, int d) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        ComplexNumber complexNumber2 = new ComplexNumber(c, d);
        int a1 = complexNumber1.getOneNum();
        int b1 = complexNumber1.getTwoNum();
        int c2 = complexNumber2.getOneNum();
        int d2 = complexNumber2.getTwoNum();
        double aa = (double) a1;
        double bb = (double) b1;
        double cc = (double) c2;
        double dd = (double) d2;
        double open = (aa * cc + bb * dd) / ((Math.pow(cc, 2) + (Math.pow(dd, 2))));
        double close = (bb * cc - aa * dd) / ((Math.pow(cc, 2) + (Math.pow(dd, 2))));
        return String.format("(%s)/(%s)=%s%si", complexNumber1, complexNumber2, open, close);
    }

    //метод возвращает произведение  двух комплексных чисел
    @Override
    public String multiplyNumbers(int a, int b, int c, int d) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        ComplexNumber complexNumber2 = new ComplexNumber(c, d);
        int a1 = complexNumber1.getOneNum();
        int b1 = complexNumber1.getTwoNum();
        int c2 = complexNumber2.getOneNum();
        int d2 = complexNumber2.getTwoNum();
        int e = a1 * c2 - b1 * d2;
        int f = a1 * d2 + b1 * c2;
        if (f < 0) {
            return String.format("(%s)*(%s)=%s%si", complexNumber1, complexNumber2, e, f);
        } else {
            return String.format("(%s)*(%s)=%s+%si", complexNumber1, complexNumber2, e, f);
        }
    }

    //метод возвращает сумму комплексного числа
    @Override
    public String plusNum(int a, int b) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        return String.format("%s", complexNumber1);
    }

    //метод возвращает разность комплексного числа
    @Override
    public String shareNum(int a, int b) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        if (b < 0) {
            return String.format("%s/(%si)", complexNumber1.getOneNum(), complexNumber1.getTwoNum());
        } else {
            return String.format("%d/%di", complexNumber1.getOneNum(), complexNumber1.getTwoNum());
        }
    }

    //метод возвращает произведение комплексного числа
    @Override
    public String multiplyNum(int a, int b) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        if (b < 0) {
            return String.format("%s*(%si)", complexNumber1.getOneNum(), complexNumber1.getTwoNum());
        } else {
            return String.format("%d*%di", complexNumber1.getOneNum(), complexNumber1.getTwoNum());
        }
    }

    //метод возвращает частность комплексного числа
    @Override
    public String minusNum(int a, int b) {
        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        if (b < 0) {
            return String.format("%s+%si", complexNumber1.getOneNum(), complexNumber1.getTwoNum() * -1);
        } else {
            return String.format("%d-%di", complexNumber1.getOneNum(), complexNumber1.getTwoNum());
        }
    }

}
