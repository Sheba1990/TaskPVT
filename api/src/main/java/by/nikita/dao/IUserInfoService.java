package by.nikita.dao;

import by.nikita.entities.UserInfo;

public interface IUserInfoService {

    UserInfo getUserByPassAndName(String password, String name);
}
