package edu.cca.john.jfs.repositories;

import java.util.Stack;
import edu.cca.john.jfs.blueprint.StackCRUD;
import edu.cca.john.jfs.entity.Mobile;

public class StackRepository implements StackCRUD {
	private Stack<Mobile> mobiles;
	
	public StackRepository() {
		mobiles = new Stack<Mobile>();
		mobiles.push(new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00));
		mobiles.push(new Mobile("Samsung","S25",2023,92800.00));
		mobiles.push(new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.push(new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.push(new Mobile("Lava","Agni 3",2021,32800.00));
	}
	@Override
	public Long create(Mobile mb) {
		mobiles.push(mb);
		return mb.getId();
	}

	@Override
	public Stack<Mobile> readAll() {
		return mobiles;
	}

	@Override
	public Mobile readOne(Long id) {
		Mobile mob = null;
		Mobile smob = null;
		Stack<Mobile> temp = new Stack<Mobile>();
		while(!mobiles.isEmpty()) {
			mob = mobiles.pop();
			temp.push(mob);
			if(mob.getId().equals(id))
				smob = mob;
		}
		mobiles.addAll(temp);
		return smob;
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
		if(mob!=null) {
			Stack<Mobile> temp = new Stack<Mobile>();
			while(!mobiles.isEmpty()) {
				mob = mobiles.pop();
				if(!mob.getId().equals(id))
					temp.add(mob);
			}
			mobiles.addAll(temp);
			return true;
		}
		else {
			return false;
		}
	}

}
