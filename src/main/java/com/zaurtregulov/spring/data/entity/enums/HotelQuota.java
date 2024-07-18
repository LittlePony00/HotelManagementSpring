package com.zaurtregulov.spring.data.entity.enums;

public enum HotelQuota {
    STANDARD("No special privileges", 0),
    CORPORATE("Corporate rate", 10),
    GOVERNMENT("Government rate", 15),
    MILITARY("Military discount", 20),
    SENIOR("Senior citizen discount", 10),
    AAA_CAA("AAA/CAA member discount", 10),
    LOYALTY_PROGRAM("Hotel loyalty program", 15),
    LONG_STAY("Extended stay discount", 20),
    GROUP("Group booking discount", 15),
    LAST_MINUTE("Last minute deal", 25);

    private String privilegesName;
    private int discount;

    HotelQuota(String privilegesName, int discount) {
        this.privilegesName = privilegesName;
        this.discount = discount;
    }

    public String getPrivilegesName() {
        return privilegesName;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
