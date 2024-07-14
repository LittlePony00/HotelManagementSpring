package com.zaurtregulov.spring.dto;

import com.zaurtregulov.spring.domain.dto.GuestDto;

public class GuestDtoImpl implements GuestDto {
    private String name;
    private String contactInfo;

    protected GuestDtoImpl() {}

    public GuestDtoImpl(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
