package com.github.antksk.ex.mt.multiplicationtable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.antksk.ex.mt.multiplicationtable.times.First;

import lombok.extern.slf4j.Slf4j;

import static com.github.antksk.ex.mt.multiplicationtable.times.First.all;
import static com.github.antksk.ex.mt.multiplicationtable.times.Times.times;

@DisplayName("구구단 테이블 통합 테스트 (전체 단수 표시)")
@Slf4j
public class TimesTableTest {

    @DisplayName("각 구구단수 별 표시")
    @Test
    public void test(){
        for (First first : all()) {
            log.debug("--- [{}] ---------", first);
            times(first)
                .forEach(r->log.debug("{} * {} = {}", r.getFirstTime(), r.getSecondTime(), r.toResult()));
        }
    }
}