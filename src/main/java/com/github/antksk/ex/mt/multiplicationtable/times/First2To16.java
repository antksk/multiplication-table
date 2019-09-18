package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;

import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.secondTimesCreater;
import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.timesCollect;
import static com.github.antksk.ex.mt.multiplicationtable.times.FirstTimes.timesResultable;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

enum First2To16 implements Timeable, FirstTimeable{
    ten(10),
    eleven(11),
    twelve(12),
    thirteen(13),
    fourteen(14),
    fifteen(15),
    sixteen(16)
    ;
    @Getter
    private final int time;

    First2To16(int time) {
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


    static Comparator<Timeable> comparator(){
        return (o,t)-> o.getTime() - t.getTime();
    }

    /**
     * 아이템 36. 비트 필드 대신 EnumSet을 사용하라.
     */
    private static Set<? extends FirstTimeable> firstTimeables = Collections.unmodifiableSet(Stream.concat(
        First2To9.all().stream(),
        EnumSet.allOf(First2To16.class).stream()
    ).collect(toCollection(()->new TreeSet(comparator()))));

    public static Collection<? extends FirstTimeable> all(){
        return firstTimeables;
    }
}
