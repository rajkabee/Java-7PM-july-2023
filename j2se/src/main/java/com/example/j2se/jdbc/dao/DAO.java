package com.example.j2se.jdbc.dao;

import java.util.List;

public interface DAO<T, I>{
	public void connect();
	public void disconnect();
	public int save(T t);
	public int update(T t);
	public T getOne(I i);
	public int delete(I i);
	public List<T> getAll();
}
