package com.fastcampus.springbatch.core.repository;

import com.fastcampus.springbatch.core.domain.PlainText;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlainTextRepository extends JpaRepository<PlainText, Integer> {
    Page<PlainText> findBy(Pageable pageable);
}
