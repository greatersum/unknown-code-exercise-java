public class UnknownCode {

    private int situationThree(int i) {
        return getNumber(i-1) + getNumber(i-(specialNumber + 2));
    }

    private boolean situationTwo(int i) {
        return i == specialNumber + 1;
    }

    private boolean situationOne(int i) {
        return i == specialNumber;
    }

    public UnknownCode() {
        specialNumber = 0;
    }

    int getNumber(int i) {
        if (situationOne(i)){
            return specialNumber;
        }
        if (situationTwo(i)){
            return 1;
        }
        return situationThree(i);
    }

    private final int specialNumber;
}