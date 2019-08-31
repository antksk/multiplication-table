package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface SecondTimesCreatersSupplier extends Supplier<Collection<? extends Timeable>> {
}
