package com.github.antksk.ex.mt.multiplicationtable.times;

public interface TimesResultable {

    Timeable getFirst();

    Timeable getSecond();

    default int toResult() {
        return getFirstTime() * getSecondTime();
    }

    default int getFirstTime() {
        return getFirst().getTime();
    }

    default int getSecondTime() {
        return getSecond().getTime();
    }
}
