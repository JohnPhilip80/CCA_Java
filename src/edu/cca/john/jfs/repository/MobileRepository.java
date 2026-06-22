package edu.cca.john.jfs.repository;

import java.util.ArrayList;
import java.util.List;

import edu.cca.john.jfs.blueprint.MobileCRUD;
import edu.cca.john.jfs.model.Mobile;

public class MobileRepository implements MobileCRUD {
	private List<Mobile> mobiles;
	public MobileRepository() {
		mobiles = new ArrayList<Mobile>();
		mobiles.add(new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00));
		mobiles.add(new Mobile("Samsung","S25",2023,92800.00));
		mobiles.add(new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.add(new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.add(new Mobile("Lava","Agni 3",2021,32800.00));
	}
	@Override
	public Long createMobile(Mobile mb) {
		mobiles.add(mb);
		return mb.getId();
	}

	@Override
	public List<Mobile> readMobiles() {
		return mobiles;
	}

	@Override
	public Mobile readMobile(Long id) {
		Mobile mobile = null;
		for(int i=0;i<mobiles.size();i++) {
			if(mobiles.get(i).getId().equals(id)) {
				mobile = mobiles.get(i);
				break;
			}
		}
		return mobile;
	}

	@Override
	public boolean updateMobile(Mobile mb) {
		Mobile mobile = readMobile(mb.getId());
		if(mobile != null) {
			mobile.setBrand(mb.getBrand());
			mobile.setModel(mb.getModel());
			mobile.setYearLaunched(mb.getYearLaunched());
			mobile.setPrice(mb.getPrice());
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean deleteMobile(Long id) {
		Mobile mobile = readMobile(id);
			if(mobile != null) {
				mobiles.remove(mobile);
				return true;
			}
			else
				return false;
	}

}
