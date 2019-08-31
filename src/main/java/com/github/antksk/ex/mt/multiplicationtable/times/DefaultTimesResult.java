package com.github.antksk.ex.mt.multiplicationtable.times;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
class DefaultTimesResult implements TimesResultable {
    @EqualsAndHashCode.Exclude
    private final Timeable first;
    private final Timeable second;

    @Builder
    private DefaultTimesResult(Timeable first, Timeable second) {
        this.first = first;
        this.second = second;
    }

    static DefaultTimesResult of(Timeable first, Timeable second){
        return DefaultTimesResult.builder()
                                 .first(first)
                                 .second(second)
                                 .build();
    }
}
