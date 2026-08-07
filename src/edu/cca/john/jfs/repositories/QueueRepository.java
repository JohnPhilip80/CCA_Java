package edu.cca.john.jfs.repositories;

import java.util.LinkedList;
import java.util.Queue;

import edu.cca.john.jfs.blueprint.QueueCRUD;
import edu.cca.john.jfs.entity.Mobile;

public class QueueRepository implements QueueCRUD {
	private Queue<Mobile> mobiles;
	
	public QueueRepository() {
		mobiles = new LinkedList<Mobile>();
		mobiles.offer(new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00));
		mobiles.offer(new Mobile("Samsung","S25",2023,92800.00));
		mobiles.offer(new Mobile("Motorola","Edge 5",2023,15900.00));
		mobiles.offer(new Mobile("Redmi","Note 6",2022,18250.00));
		mobiles.offer(new Mobile("Lava","Agni 3",2021,32800.00));
	}
	@Override
	public Long create(Mobile mb) {
		mobiles.offer(mb);
		return mb.getId();
	}

	@Override
	public Queue<Mobile> readAll() {
		return mobiles;
	}

	@Override
	public Mobile readOne(Long id) {
		Mobile mob = null;
		Mobile smob = null;
		Queue<Mobile> temp = new LinkedList<Mobile>();
		while(!mobiles.isEmpty()) {
			mob = mobiles.remove();
			temp.add(mob);
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
			Queue<Mobile> temp = new LinkedList<Mobile>();
			while(!mobiles.isEmpty()) {
				mob = mobiles.remove();
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
