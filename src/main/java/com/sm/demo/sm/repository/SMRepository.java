package com.sm.demo.sm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sm.demo.sm.entity.SM;

public interface SMRepository extends JpaRepository<SM, Long> {

//	List<SM> findByIdLikeAndNameLikeAndEchelonLikeAndEduLevelLikeAndCountryLikeAndLicenseLike(@NullMeans() String id, String name, String Echelon,
//			String EduLevel, String country,boolean license);
	//List<SM> findAllByIdLikeAndNameLikeAndEchelonLike(String id,String name,String echelon);
	
	 Optional<SM> findById(Long id) ;
	
	@Query( value="SELECT s FROM SM s "
			+ "WHERE (:#{#id == '' ? 0 : 1} = 0 OR id LIKE %:id%) 	"
			+ "AND   (:#{#name == '' ? 0 : 1} = 0 OR name LIKE %:name%) 	"
			+ "AND   (:#{#echelon == '' ? 0 : 1} = 0 OR echelon LIKE %:echelon%) 	"
			+ "AND   (:#{#eduLevel == '' ? 0 : 1} = 0 OR eduLevel LIKE %:eduLevel%) 	"
			+ "AND   (:#{#country == '' ? 0 : 1} = 0 OR country LIKE %:country%) 	")
	List<SM> findByAllCondition(@Param(value = "id") String id,@Param(value = "name") String name,@Param(value = "echelon") String echelon,
			@Param(value = "eduLevel") String eduLevel,@Param(value = "country")  String country);
	
}
