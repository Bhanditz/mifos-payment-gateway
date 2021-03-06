/**
 * File: BatchRepository.java
 * =========================================
 * This interface will create a jpa repository that will
 * help us crud our batch database table.
 * @author Vladimir Fomene
 **/

package org.mifos.mifospaymentbridge.repository;

import org.springframework.data.repository.CrudRepository;
import org.mifos.mifospaymentbridge.model.Batch;

public interface BatchRepository extends CrudRepository<Batch, Long>{

}