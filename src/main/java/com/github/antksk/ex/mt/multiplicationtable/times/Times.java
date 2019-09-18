package com.github.antksk.ex.mt.multiplicationtable.times;

import java.util.Collection;

public class Times {

    public static int times(FirstTimeable firstTimeable, Second second ){
        return firstTimeable.times(second)
                            .toResult();
    }

    public static Collection<? extends TimesResultable> times(FirstTimeable firstTimeable){
        return firstTimeable.times();
    }

    public static Collection<? extends FirstTimeable> allFirst2To9(){
        return First2To9.all();
    }

    public static Collection<? extends FirstTimeable> allFirst2To16(){
        return First2To16.all();
    }
}
