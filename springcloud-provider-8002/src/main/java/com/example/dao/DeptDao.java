package com.example.dao;

import com.example.entity.Dept;

import java.util.List;

/**
 * TODO
 */

public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
