package com.petromanage.asset.dto;

import com.petromanage.asset.enums.AssetStatus;
import com.petromanage.asset.enums.AssetType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssetRequestDTO {

    @NotBlank
    private String name;

    @NotNull
    private AssetType type;

    private String location;

    // 🔥 ADD THIS (LIFECYCLE STATUS)
    private AssetStatus status;
}
