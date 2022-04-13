package com.danakga.webservice.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyUserInfoDto {

    //권한 ( user,manager,admin)
    private String role;

    //사업자등록번호
    private String companyId;

    //회사명
    private String companyName;

    //회사연락처
    private String companyNum;

    //회사 우편번호
    private String companyAdrNum;

    //회사 기본주소
    private String companyDefNum;

    //회사 상세주소
    private String companyDetailAdr;

    //회사 계좌
    private String companyBanknum;

}
