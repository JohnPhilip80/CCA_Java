package edu.cca.john.jfs.repositories;

import java.util.HashSet;
import java.util.Set;

import edu.cca.john.jfs.blueprint.SetCRUD;
import edu.cca.john.jfs.entity.Mobile;

public class SetRepository implements SetCRUD {
	private Set<Mobile> mobiles;
	
	public SetRepository() {
		mobiles = new HashSet<Mobile>();
		mobiles.add(new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00));
		mobiles.add(new Mobile("Samsung","S25",2023,92800.00));
		mobiles.add(new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.add(new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.add(new Mobile("Lava","Agni 3",2021,32800.00));
	}
	@Override
	public Long create(Mobile mb) {
		mobiles.add(mb);
		return mb.getId();
	}

	@Override
	public Set<Mobile> readAll() {
		return mobiles;
	}

	@Override
	public Mobile readOne(Long id) {
		Mobile mobile = null;
		for(Mobile mob:mobiles) {
			if(mob.getId().equals(id)) {
				mobile = mob;
				break;
			}
		}
		return mobile;
	}

	@Override
	public boolean update(Mobile mb) {
		Mobile mob = readOne(mb.getId());
		if(mob != null) {
			mob.setBrand(mb.getBrand());
			mob.setModel(mb.getModel());
			mob.setPrice(mb.getPrice());
			mob.setYearLaunched(mb.getYearLaunched());
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean delete(Long id) {
		Mobile mob = readOne(id);
		if(mob != null) {
			mobiles.remove(mob);
			return true;
		}
		else {
			return false;
		}
	}

}
