public class SimpleCaluclator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult() {
        return secondNumber*firstNumber;
    }
    public double getDivisionResult() {
        if (secondNumber==0){
            return 0;
        }else{
            return firstNumber/secondNumber;
        }
    }
}



