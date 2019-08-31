package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;

public class Times {


    public static int times( First first, Second second ){
        return first.times(second)
                    .toResult();
    }


    public static Collection<? extends TimesResultable> times( First first ){
        return first.times();
    }
}
