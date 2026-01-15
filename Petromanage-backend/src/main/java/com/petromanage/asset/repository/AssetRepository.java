package com.petromanage.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petromanage.asset.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {
}
