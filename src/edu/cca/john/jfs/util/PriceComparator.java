package edu.cca.john.jfs.util;

import java.util.Comparator;

import edu.cca.john.jfs.entity.Mobile;

public class PriceComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return (int) (o1.getPrice() - o2.getPrice());
	}

}
