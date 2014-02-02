package fr.zoumanatraore.restdemo.dao;

// Generated 31 août 2012 17:55:31 by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.zoumanatraore.restdemo.model.Item;

/**
 * Home object for domain model class Item.
 * @see fr.zoumanatraore.restdemo.model.Item
 * @author Hibernate Tools
 */
public class ItemDao {

	private static final Log log = LogFactory.getLog(ItemDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Item transientInstance) {
		log.debug("persisting Item instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Item persistentInstance) {
		log.debug("removing Item instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Item merge(Item detachedInstance) {
		log.debug("merging Item instance");
		try {
			Item result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Item findById(int id) {
		log.debug("getting Item instance with id: " + id);
		try {
			Item instance = entityManager.find(Item.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
