package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.function.Function;

import lombok.Getter;

import static java.util.stream.Collectors.toSet;

@Getter
class FirstTimes {
    /**
     * 아이템 42. 익명 클래스 보다는 람다를 사용하라.
     * 아이템 44. 표준 함수형 인터페이스를 사용하라.
     */
    static final SecondTimesCreaterFunction secondTimesCreater = Second::of;
    private static final SecondTimesCreatersSupplier secondTimesCreaters = Second::all;

    static final TimesResultableFunction timesResultable = DefaultTimesResult::of;


    static Collection<? extends TimesResultable> timesCollect(Function<? super Timeable, ? extends TimesResultable> timesResultableFunction){
        return secondTimesCreaters.get().stream()
                           .map(timesResultableFunction)
                           .collect(toSet());
    }
}
