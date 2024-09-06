package com.ctel.HpfsApRedis.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctel.HpfsApRedis.entity.GOAP_SH_REGISTER;


@Repository
public interface Repositary extends JpaRepository<GOAP_SH_REGISTER, String> {

	@Query(value = "  SELECT  gsr.*  FROM  GOAP_ICDC gi    INNER JOIN  VENDOR_ICDC_CASE_MAP vicm ON gi.ID = vicm.ICDC_ID  INNER JOIN "
			+ "	GOAP_SH_REGISTER gsr ON vicm.CASE_BARCODE = gsr.CASE_BARCODE  WHERE   gi.STATUS = 42  "
			+ "			     ORDER BY             gi.VENDOR_LOC_ID ASC  ", nativeQuery = true)
	List<GOAP_SH_REGISTER> getData();

	@Query(value = "UPDATE GOAP_SH_REGISTER SET STATUS =15 WHERE SH_CODE =:shCode", nativeQuery = true)
	public void updateBotleSellStatusByShcode(String shCode);

//	@Query(value = "SELECT gi.ID,gi.VENDOR_LOC_ID FROM GOAP_ICDC gi INNER JOIN VENDOR_ICDC_CASE_MAP s ON gi.ID=s.ICDC_ID INNER JOIN GOAP_SH_REGISTER rg ON  s.CASE_BARCODE=rg.CASE_BARCODE  AND rg.SH_CODE=:shCode  ", nativeQuery = true)
//	public List<?> getIcDcIdByByShcode(String shCode);
}
