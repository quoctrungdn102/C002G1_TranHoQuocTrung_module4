package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class MedicalService implements IMedicalService {
    @Override
    public String[] lisTransport() {
        return new String[]{"tàu bay", "tàu thuyền", "ô tô", "khác"};
    }

    @Override
    public String[] listGender() {
        return new String[]{"Nam", "Nữ", "khác"};
    }

    @Override
    public String[] listCountry() {
        return new String[]{"VN", "USA", "khác"};
    }

    @Override
    public Integer[] listDay() {
        return new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30};
    }

    @Override
    public Integer[] listMonth() {
        return  new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    @Override
    public Integer[] listYears() {
        return new Integer[]{2018, 2019, 2020, 2021, 2022, 2023, 2024};
    }
}
