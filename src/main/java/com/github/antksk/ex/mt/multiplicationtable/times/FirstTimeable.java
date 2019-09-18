package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;

public interface FirstTimeable {
    TimesResultable times(Timeable time);

    TimesResultable times(int time);

    Collection<? extends TimesResultable> times();
}
