package by.nikita.api;

import by.nikita.entities.UserInfo;

public interface IUserInfoService {

    UserInfo getUserByPassAndName(String password, String name);
}
