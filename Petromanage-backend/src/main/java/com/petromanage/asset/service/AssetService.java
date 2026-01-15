package com.petromanage.asset.service;

import java.util.List;

import com.petromanage.asset.dto.AssetRequestDTO;
import com.petromanage.asset.dto.AssetResponseDTO;

public interface AssetService {

    AssetResponseDTO createAsset(AssetRequestDTO dto);
    List<AssetResponseDTO> getAllAssets();
    AssetResponseDTO getAssetById(Long id);
    AssetResponseDTO updateAsset(Long id, AssetRequestDTO dto);
    void deleteAsset(Long id);
}
