package by.nikita.service;

import by.nikita.dao.IUserInfoService;
import by.nikita.entities.UserInfo;

import java.util.HashMap;
import java.util.Map;

public class UserInfoService implements IUserInfoService {

    Map<String, UserInfo> users = new HashMap<>();

    {
        users.put("Nik", new UserInfo("Nik", "Nik", 29));
    }

    private static UserInfoService instance = new UserInfoService();

    public static UserInfoService getInstance() {
        return instance;
    }

    private UserInfoService() {
    }

    public UserInfo getUserByPassAndName(String password, String name) {
        UserInfo ui = users.get(name);
        if (ui != null) {
            if (ui.getPassword().contains(password)) {
                return ui;
            } else
                return null;
        }
        return null;
    }

}
