package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
	    for (Integer item : list) {
		    if(item % 2 == 0) {
			    resultList.add(0, item);
                continue;
		    }
            resultList.add(item);
	    }
	    return resultList;
    }
}
