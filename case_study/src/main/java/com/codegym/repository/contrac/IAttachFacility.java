package com.codegym.repository.contrac;

import com.codegym.model.contract.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IAttachFacility extends JpaRepository<AttachFacility,Integer> {

}
