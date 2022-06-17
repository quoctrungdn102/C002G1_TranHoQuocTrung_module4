package com.codegym.service;

import com.codegym.model.Setting;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    public static Setting setting;

    static {
        setting = new Setting("viet nam", 15, false, "trung tran");
    }

    public Setting displaySetting() {

        return setting;
    }

    public Setting saveSetting(Setting setting1) {
        setting.setLanguage(setting1.getLanguage());
        setting.setPageSize(setting1.getPageSize());
        setting.setSpamsFilter(setting1.isSpamsFilter());
        setting.setSignature(setting1.getSignature());
        return setting;
    }
}
