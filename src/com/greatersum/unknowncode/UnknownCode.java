package com.greatersum.unknowncode;

class UnknownCode {
    int getNumber(int i) {
        if (i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        return getNumber(i-1) + getNumber(i-2);
    }
}
