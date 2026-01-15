package com.petromanage.asset.dto;

import com.petromanage.asset.enums.AssetStatus;
import com.petromanage.asset.enums.AssetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssetResponseDTO {

    private Long assetId;
    private String name;
    private AssetType type;
    private String location;
    private AssetStatus status;
}
