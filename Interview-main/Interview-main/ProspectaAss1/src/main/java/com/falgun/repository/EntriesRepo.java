package com.falgun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.falgun.models.Entries;

public interface EntriesRepo extends JpaRepository<Entries, Integer> {

	public Entries findByApi(String api);
}
