package com.cristhianvg.MFAGoogleAuthenticator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MFAValidationRequest extends MFABaseValidationRequest {
    private String secondCode;
}