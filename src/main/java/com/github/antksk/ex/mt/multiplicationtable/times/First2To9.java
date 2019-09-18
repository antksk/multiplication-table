package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import lombok.Getter;

import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.secondTimesCreater;
import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.timesCollect;
import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.timesResultable;

enum First2To9 implements Timeable, FirstTimeable {
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

    First2To9(int time) {
        this.time = time;
    }


    @Override
    public TimesResultable times(Timeable time){
        return timesResultable.apply(this, time);
    }

    @Override
    public TimesResultable times(int time){
        return times(secondTimesCreater.apply(time));
    }

    @Override
    public Collection<? extends TimesResultable> times(){
        return timesCollect((s) -> times(s));
    }

    /**
     * 아이템 36. 비트 필드 대신 EnumSet을 사용하라.
     */
    private static Set<? extends FirstTimeable> firstTimeables = Collections.unmodifiableSet(EnumSet.of(
        two, three, four, five, six, seven, eight, nine
    ));

    public static Collection<? extends FirstTimeable> all(){
        return firstTimeables;
    }
}
