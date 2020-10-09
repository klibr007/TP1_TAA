package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.istic.m2.TP1_TAA.Card;
import fr.istic.m2.TP1_TAA.User;

public class CardDao extends AbstractJpaDao<Long, Card>{
	
	public CardDao() {
		this.setClazz(Card.class);
	}
	
}
