package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import static com.github.antksk.ex.mt.multiplicationtable.times.Second.SecondCache.empty;
import static com.github.antksk.ex.mt.multiplicationtable.times.Second.SecondCache.getCacheSecond;
import static com.github.antksk.ex.mt.multiplicationtable.times.Second.SecondCache.seconds;
import static com.github.antksk.ex.mt.multiplicationtable.times.Second.TimesHelper.beOutOfTimes;
import static java.util.Collections.unmodifiableList;
import static java.util.Collections.unmodifiableSet;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

/**
 * 아이템 10. equals는 일반 규약을 지켜 재정의하라.
 * 아이템 11. equals를 재정의하려거든 hashCode도 재정의하라.
 * 아이템 12. toString을 항상 재정의하라.
 * 아이템 14. Comparable을 구현할지 고려하라.
 */
@ToString
@EqualsAndHashCode
final class Second implements Comparable<Timeable>, Timeable {
    public static final int LOWER_TIMES = 0;
    public static final int HIGHER_TIMES = 9;

    @Getter
    private final int time;

    private Second(int time) {
        this.time = time;
    }

    public boolean isEmpty(){
        return 0 == time;
    }

    public boolean isNotEmpty(){
        return false == isEmpty();
    }

    /**
     * 아이템 1. 생성자 대신 정적 팩터리 메서드를 고려하라.
     * @param time
     * @return
     */
    public static Second of(int time){
        return beOutOfTimes(time) ? empty()
            : getCacheSecond(time);
    }

    public static Collection<Second> all(){
        return seconds();
    }

    @Override
    public int compareTo(Timeable o) {
        return time - o.getTime();
    }

    /**
     *
     * 아이템 24. 맴버 클래스는 되도록 static으로 만들어라.
     * 아이템 28. 배열보다는 리스트를 사용하라.
     */
    static class SecondCache{
        private static final Second empty;

        private static final List<Second> seconds;

        static {
            seconds = unmodifiableList(IntStream.rangeClosed(LOWER_TIMES, HIGHER_TIMES)
                                                            .mapToObj(Second::new)
                                                            .collect(toList()));

            empty = getCacheSecond(0);
        }

        static Set<Second> seconds(){
            final TreeSet<Second> collect = seconds.stream()
                                             .filter(Second::isNotEmpty)
                                             .collect(toCollection(TreeSet::new));
            return unmodifiableSet(collect);
        }

        static Second getCacheSecond(int time) {
            return seconds.get(time);
        }

        static Second empty(){
            return empty;
        }
    }

    static class TimesHelper {
        public static boolean beOutOfTimes(int time) {
            return isLowerTimes(time) || isHigherTimes(time);
        }

        private static boolean isLowerTimes(int time) {
            return LOWER_TIMES > time;
        }

        private static boolean isHigherTimes(int time) {
            return HIGHER_TIMES < time;
        }
    }
}
