
package com.demo.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.demo.entity.Products;

public interface ProductsRepo extends CassandraRepository<Products, UUID> {

	@Query(allowFiltering = true)
	Products findByProdCode(String prodCode);

}
