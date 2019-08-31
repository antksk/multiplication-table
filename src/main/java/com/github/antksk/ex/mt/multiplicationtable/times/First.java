package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import lombok.Getter;

import static java.util.stream.Collectors.toSet;

public enum First implements Timeable {
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9)
    ;

    @Getter
    private final int time;

    First(int time) {
        this.time = time;
    }

    private static final SecondTimesCreaterFunction secondTimesCreater = Second::of;
    private static final SecondTimesCreatersSupplier secondTimesCreaters = Second::all;

    private static final TimesResultableFunction timesResultable = DefaultTimesResult::of;

    TimesResultable times(Timeable time){
        return timesResultable.apply(this, time);
    }

    TimesResultable times(int time){
        return times(secondTimesCreater.apply(time));
    }

    Collection<? extends TimesResultable> times(){
        return secondTimesCreaters.get().stream()
              .map(s->times(s))
              .collect(toSet());
    }

    private static Set<First> firsts = EnumSet.of(
        two, three, four, five, six, seven, eight, nine
    );

    public static Collection<First> all(){
        return firsts;
    }
}
