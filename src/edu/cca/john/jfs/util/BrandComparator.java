package edu.cca.john.jfs.util;

import java.util.Comparator;

import edu.cca.john.jfs.entity.Mobile;

public class BrandComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
