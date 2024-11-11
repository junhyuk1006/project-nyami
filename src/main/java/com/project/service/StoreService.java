package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.domain.Menu;
import com.project.domain.StoreDomain;
import com.project.mapper.StoreMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {

	private final StoreMapper storeMapper;

	public StoreDomain getStoreDetailById(int store_ID) {
		return storeMapper.getStoreDetailById(store_ID);
	}

	public List<Menu> getMenuById(int storeId) {
		return storeMapper.getMenuById(storeId);
	}
	
}
