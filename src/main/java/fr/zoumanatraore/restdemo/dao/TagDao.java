package fr.zoumanatraore.restdemo.dao;

// Generated 31 août 2012 17:55:31 by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.zoumanatraore.restdemo.model.Tag;

/**
 * Home object for domain model class Tag.
 * @see fr.zoumanatraore.restdemo.model.Tag
 * @author Hibernate Tools
 */
public class TagDao {

	private static final Log log = LogFactory.getLog(TagDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tag transientInstance) {
		log.debug("persisting Tag instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tag persistentInstance) {
		log.debug("removing Tag instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tag merge(Tag detachedInstance) {
		log.debug("merging Tag instance");
		try {
			Tag result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tag findById(String id) {
		log.debug("getting Tag instance with id: " + id);
		try {
			Tag instance = entityManager.find(Tag.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
