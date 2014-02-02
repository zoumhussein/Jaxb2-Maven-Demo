package fr.zoumanatraore.restdemo.dao;

// Generated 31 août 2012 17:55:31 by Hibernate Tools 3.4.0.CR1

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.zoumanatraore.restdemo.model.Vote;

/**
 * Home object for domain model class Vote.
 * @see fr.zoumanatraore.restdemo.model.Vote
 * @author Hibernate Tools
 */
public class VoteDao {

	private static final Log log = LogFactory.getLog(VoteDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Vote transientInstance) {
		log.debug("persisting Vote instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Vote persistentInstance) {
		log.debug("removing Vote instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Vote merge(Vote detachedInstance) {
		log.debug("merging Vote instance");
		try {
			Vote result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Vote findById(int id) {
		log.debug("getting Vote instance with id: " + id);
		try {
			Vote instance = entityManager.find(Vote.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
