package org.example;

import java.util.*;
import java.util.function.UnaryOperator;

public class WorkintechList extends ArrayList {

    public void sort()
    {
        Set<String> list = new TreeSet<>(this);
        this.clear();
        this.addAll(list);
    }

    @Override
    public boolean add(Object obj)
    {
        Iterator itr = this.iterator();
        boolean sameObject = false;
        while (itr.hasNext())
        {
            if(itr.next().equals(obj))
            {
                sameObject = true;
            }
        }
        if(!sameObject)
        {
            super.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object obj)
    {
        if(super.remove(obj))
        {
            sort();
            return true;
        }
        return false;
    }
}
