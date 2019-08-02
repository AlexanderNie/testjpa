package com.welearn.testapp.repo;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.welearn.testapp.model.Foo;

public interface IFooDAO extends Repository<Foo, Integer> {
	Foo findByName(String name);

	Foo save(Foo persisted);

	List<Foo> findAll();
}
