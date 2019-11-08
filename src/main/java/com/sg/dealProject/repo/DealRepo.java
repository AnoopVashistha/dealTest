/**
 * 
 */
package com.sg.dealProject.repo;

import com.sg.dealProject.entity.Deal;

/**
 * @author Anoop
 *
 */

@Repository
public interface DealsRepository extends JPARepository<Deal, Long> {
	
}
