package by.nikita.dao;

import by.nikita.entities.CarInfo;

import java.util.List;

public interface ICarInfoService {

    CarInfo getCarById(int id);

    List<CarInfo> getCarsByUsername(String username);
}
