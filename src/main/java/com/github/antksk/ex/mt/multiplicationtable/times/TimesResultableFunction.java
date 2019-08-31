package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.function.BiFunction;

@FunctionalInterface
interface TimesResultableFunction extends BiFunction<Timeable, Timeable, TimesResultable> {

}
