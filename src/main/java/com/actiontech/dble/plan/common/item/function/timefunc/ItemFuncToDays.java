package com.actiontech.dble.plan.common.item.function.timefunc;

import com.actiontech.dble.plan.common.item.Item;
import com.actiontech.dble.plan.common.item.function.ItemFunc;
import com.actiontech.dble.plan.common.item.function.primary.ItemIntFunc;
import com.actiontech.dble.plan.common.time.MySQLTime;
import com.actiontech.dble.plan.common.time.MyTime;

import java.math.BigInteger;
import java.util.List;

public class ItemFuncToDays extends ItemIntFunc {

    public ItemFuncToDays(List<Item> args) {
        super(args);
    }

    @Override
    public final String funcName() {
        return "to_days";
    }

    @Override
    public BigInteger valInt() {
        MySQLTime ltime = new MySQLTime();
        if (getArg0Date(ltime, MyTime.TIME_NO_ZERO_DATE))
            return BigInteger.ZERO;
        return BigInteger.valueOf(MyTime.calcDaynr(ltime.getYear(), ltime.getMonth(), ltime.getDay()));
    }

    @Override
    public void fixLengthAndDec() {
        maxLength = 6;
        maybeNull = true;
    }

    @Override
    public ItemFunc nativeConstruct(List<Item> realArgs) {
        return new ItemFuncToDays(realArgs);
    }

}