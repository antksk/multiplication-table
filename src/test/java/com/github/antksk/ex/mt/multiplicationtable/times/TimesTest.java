package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Arrays;
import java.util.ListIterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.eleven;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.fifteen;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.fourteen;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.sixteen;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.ten;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.thirteen;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To16.twelve;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.eight;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.five;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.four;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.nine;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.seven;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.six;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.three;
import static com.github.antksk.ex.mt.multiplicationtable.times.First2To9.two;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("구구단 테스트")
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

    @DisplayName("10단 테스트")
    @Test
    public void test_10() {
        multiplicationTimesAssert(ten, 10, 20, 30, 40, 50, 60, 70, 80, 90);
    }

    @DisplayName("11단 테스트")
    @Test
    public void test_11() {
        multiplicationTimesAssert(eleven, 11, 22, 33, 44, 55, 66, 77, 88, 99);
    }

    @DisplayName("12단 테스트")
    @Test
    public void test_12() {
        multiplicationTimesAssert(twelve, 12, 24, 36, 48, 60, 72, 84, 96, 108);
    }

    @DisplayName("13단 테스트")
    @Test
    public void test_13() {
        multiplicationTimesAssert(thirteen, 13, 26, 39, 52, 65, 78, 91, 104, 117);
    }

    @DisplayName("14단 테스트")
    @Test
    public void test_14() {
        multiplicationTimesAssert(fourteen, 14, 28, 42, 56, 70, 84, 98, 112, 126);
    }

    @DisplayName("15단 테스트")
    @Test
    public void test_15() {
        multiplicationTimesAssert(fifteen, 15, 30, 45, 60, 75, 90, 105, 120, 135);
    }

    @DisplayName("16단 테스트")
    @Test
    public void test_16() {
        multiplicationTimesAssert(sixteen, 16, 32, 48, 64, 80, 96, 112, 128, 144);
    }

}
