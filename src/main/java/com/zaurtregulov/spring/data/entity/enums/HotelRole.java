package com.zaurtregulov.spring.data.entity.enums;

public enum HotelRole {
    RECEPTIONIST("Администратор", 700),
    HOUSEKEEPER("Горничная", 240),
    MANAGER("Менеджер", 350),
    CHEF("Шеф-повар", 400),
    WAITER("Официант", 350),
    BELLBOY("Портье", 350),
    SECURITY("Охранник", 300),
    MAINTENANCE("Техник", 440);

    private final String displayName;
    private final double hourlyRate;

    HotelRole(String displayName, double hourlyRate) {
        this.displayName = displayName;
        this.hourlyRate = hourlyRate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return displayName + " (Ставка: $" + String.format("%.2f", hourlyRate) + "/час)";
    }
}
