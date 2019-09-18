package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Arrays;
import java.util.ListIterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.sixteen;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.two;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.three;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.four;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.five;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.six;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.seven;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.eight;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.nine;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("구구단 테스트")
@Slf4j
public class TimesTest {

    public void multiplicationTimesAssert(FirstTimeable firstTimeable, Integer ... args){
        ListIterator<? extends Number> listIterator = Arrays.asList(args).listIterator();
        while(listIterator.hasNext()){
            final int second = listIterator.nextIndex() + 1;
            Number expected = listIterator.next();
            assertThat(firstTimeable.times(second).toResult()).isEqualTo(expected);
        }
    }

    @DisplayName("2단 테스트")
    @Test
    public void test_2(){
        multiplicationTimesAssert(two,2, 4, 6, 8, 10, 12, 14, 16, 18);
    }

    @DisplayName("3단 테스트")
    @Test
    public void test_3(){
        multiplicationTimesAssert(three,3, 6, 9, 12, 15, 18, 21, 24, 27);
    }

    @DisplayName("4단 테스트")
    @Test
    public void test_4(){
        multiplicationTimesAssert(four,  4, 8, 12, 16, 20, 24, 28, 32, 36);
    }

    @DisplayName("5단 테스트")
    @Test
    public void test_5(){
        multiplicationTimesAssert(five,  5, 10, 15, 20, 25, 30, 35, 40, 45);
    }

    @DisplayName("6단 테스트")
    @Test
    public void test_6(){
        multiplicationTimesAssert(six,6, 12, 18, 24, 30, 36, 42, 48, 54);
    }

    @DisplayName("7단 테스트")
    @Test
    public void test_7(){
        multiplicationTimesAssert( seven,7, 14, 21, 28, 35, 42, 49, 56, 63);
    }

    @DisplayName("8단 테스트")
    @Test
    public void test_8(){
        multiplicationTimesAssert( eight,8, 16, 24, 32, 40, 48, 56, 64, 72);
    }

    @DisplayName("9단 테스트")
    @Test
    public void test_9(){
        multiplicationTimesAssert( nine,9, 18, 27, 36, 45, 54, 63, 72, 81);
    }

    @Test
    public void test_aaa(){
        log.debug("9 x 2 = {}", nine.times(2).toResult());
        log.debug("16 x 2 = {}", sixteen.times(2).toResult());
    }
}
