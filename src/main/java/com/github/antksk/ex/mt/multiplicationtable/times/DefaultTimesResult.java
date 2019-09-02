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

    /**
     * 아이템 17. 변경 가능성을 초소화하라.
     * 아이템 18. 상속보다는 컴포지션을 사용하라.
     * @param first
     * @param second
     */
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

    @Override
    public String toString() {
        return String.format("%d * %d = %d", first.getTime(), second.getTime(), toResult());
    }
}
