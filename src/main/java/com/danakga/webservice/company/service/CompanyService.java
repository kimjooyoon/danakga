package com.danakga.webservice.company.service;

import com.danakga.webservice.company.dto.request.CompanyInfoDto;
import com.danakga.webservice.company.dto.request.CompanyUserInfoDto;
import com.danakga.webservice.company.model.CompanyInfo;
import com.danakga.webservice.user.dto.request.UserInfoDto;
import com.danakga.webservice.user.model.UserInfo;
import org.springframework.security.core.userdetails.User;

public interface CompanyService {
    //사업자탈퇴
    Long companyDeleted(UserInfo userInfo);

    //업체명 체크
    Integer companyNameCheck(String companyName);

    //사업자 회원 등록
    Long companyRegister(CompanyUserInfoDto companyUserInfoDto);

    //사업자 회사 정보 수정
    Long companyUpdate(UserInfo userInfo, CompanyInfoDto companyInfoDto);

    //사업자 회사 정보 조회
    CompanyInfo companyInfoCheck(UserInfo userInfo);
}
