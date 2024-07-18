package com.zaurtregulov.spring.data.entity.enums;

public enum HotelBenefit {
    NO_BENEFIT("No special benefits", 0),
    ROOM_FOR_PETS("Room for pets", 2),
    EARLY_CHECK_IN("Early check-in", 5),
    LATE_CHECK_OUT("Late check-out", 5),
    FREE_BREAKFAST("Complimentary breakfast", 10),
    FREE_WIFI("Free high-speed Wi-Fi", 3),
    ROOM_UPGRADE("Room upgrade", 15),
    SPA_ACCESS("Access to spa facilities", 10),
    FITNESS_CENTER("Access to fitness center", 5),
    ;

    private String benefitName;
    private int valuePercentage;

    HotelBenefit(String benefitName, int valuePercentage) {
        this.benefitName = benefitName;
        this.valuePercentage = valuePercentage;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public int getValuePercentage() {
        return valuePercentage;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
