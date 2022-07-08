package com.codegym.repository.contrac;

import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.ContractDetail;
import com.codegym.model.dto.UsingAttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    @Modifying
    @Query(value="select new com.codegym.model.dto.UsingAttachFacility( af.nameAttachFacility ,sum (cdt.quantity )  ) from AttachFacility af join ContractDetail cdt on af.idAttachFacility = cdt.attachFacility.idAttachFacility where cdt.contract.idContract = :id group by af.idAttachFacility "
            )

    List<UsingAttachFacility> attachFacilityUsing(@Param("id") Integer id);
}
