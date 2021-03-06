package com.zk.dx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Zhangka in 2018/07/17
 */
@Transactional(readOnly = true)
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private JpaRepository<T, Long> baseRepository;

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public List<T> findAllById(Iterable<Long> ids) {
        return baseRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return baseRepository.count();
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void delete(T entity) {
        baseRepository.delete(entity);
    }

    @Transactional
    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        baseRepository.deleteAll(entities);
    }

    @Transactional
    @Override
    public void deleteAll() {
        baseRepository.deleteAll();
    }

    @Transactional
    @Override
    public <S extends T> S save(S entity) {
        return baseRepository.save(entity);
    }

    @Transactional
    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        return baseRepository.saveAll(entities);
    }

    @Override
    public Optional<T> findById(Long id) {
        return baseRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return baseRepository.existsById(id);
    }

    @Transactional
    @Override
    public void flush() {
        baseRepository.flush();
    }

    @Transactional
    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return baseRepository.saveAndFlush(entity);
    }

    @Transactional
    @Override
    public void deleteInBatch(Iterable<T> entities) {
        baseRepository.deleteInBatch(entities);
    }

    @Transactional
    @Override
    public void deleteAllInBatch() {
        baseRepository.deleteAllInBatch();
    }

    @Override
    public T getOne(Long id) {
        return baseRepository.getOne(id);
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return baseRepository.findOne(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return baseRepository.findAll(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return baseRepository.findAll(example, sort);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return baseRepository.findAll(example, pageable);
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return baseRepository.count(example);
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return baseRepository.exists(example);
    }
}
