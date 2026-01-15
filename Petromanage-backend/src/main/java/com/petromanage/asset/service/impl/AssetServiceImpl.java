package com.petromanage.asset.service.impl;

import com.petromanage.asset.dto.*;
import com.petromanage.asset.entity.Asset;
import com.petromanage.asset.repository.AssetRepository;
import com.petromanage.asset.service.AssetService;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private final AssetRepository repo;

    public AssetServiceImpl(AssetRepository repo) {
        this.repo = repo;
    }

    @Override
    public AssetResponseDTO createAsset(AssetRequestDTO dto) {
        Asset asset = new Asset();
        asset.setName(dto.getName());
        asset.setType(dto.getType());
        asset.setLocation(dto.getLocation());
        return map(repo.save(asset));
    }

    @Override
    public List<AssetResponseDTO> getAllAssets() {
        return repo.findAll().stream().map(this::map).collect(Collectors.toList());
    }

    @Override
    public AssetResponseDTO getAssetById(Long id) {
        return map(repo.findById(id).orElseThrow());
    }

    @Override
    public AssetResponseDTO updateAsset(Long id, AssetRequestDTO dto) {
        Asset asset = repo.findById(id).orElseThrow();
        asset.setName(dto.getName());
        asset.setType(dto.getType());
        asset.setLocation(dto.getLocation());
        return map(repo.save(asset));
    }

    @Override
    public void deleteAsset(Long id) {
        repo.deleteById(id);
    }

    private AssetResponseDTO map(Asset asset) {
        AssetResponseDTO dto = new AssetResponseDTO();
        dto.setAssetId(asset.getAssetId());
        dto.setName(asset.getName());
        dto.setType(asset.getType());
        dto.setLocation(asset.getLocation());
        dto.setStatus(asset.getStatus());
        return dto;
    }
}
