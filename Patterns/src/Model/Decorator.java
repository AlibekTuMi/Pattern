package Model;

import Calculate.Interface.iGetmodel;

public class Decorator implements iGetmodel {
    private iGetmodel model;

    public Decorator(iGetmodel model) {
        this.model = model;
    }

    @Override
    public String plusNumbers(int a, int b, int c, int d) {
        return String.format("||||| %s |||||", model.plusNumbers(a, b, c, d));
    }

    @Override
    public String minusNumbers(int a, int b, int c, int d) {
        return String.format("||||| %s |||||", model.minusNumbers(a, b, c, d));
    }

    @Override
    public String shareNumbers(int a, int b, int c, int d) {
        return String.format("||||| %s |||||", model.shareNumbers(a, b, c, d));
    }

    @Override
    public String multiplyNumbers(int a, int b, int c, int d) { 
        return String.format("||||| %s |||||", model.multiplyNumbers(a, b, c, d));
    }

    @Override
    public String plusNum(int a, int b) {
        return String.format("||||| %s |||||", model.plusNum(a, b));
    }

    @Override
    public String shareNum(int a, int b) {
        return String.format("||||| %s |||||", model.shareNum(a, b));
    }

    @Override
    public String multiplyNum(int a, int b) {
        return String.format("||||| %s |||||", model.multiplyNum(a, b));
    }

    @Override
    public String minusNum(int a, int b) {
        return String.format("||||| %s |||||", model.minusNum(a, b));
    }
    
}
