package by.nikita.service;

import by.nikita.entities.CarInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarInfoService {

    Map<String, List<CarInfo>> cars = new HashMap<>();

    Map<Integer, CarInfo> car = new HashMap<>();

    static private CarInfoService instance = new CarInfoService();

    public static CarInfoService getInstance() {
        return instance;
    }

    private CarInfoService() {
        cars.put("Nik", new ArrayList<CarInfo>());

        cars.get("Nik").add(new CarInfo(
                1,
                "images/demo/mercedes-benz_500e.jpg",
                "From 1990 to 1995, Mercedes-Benz sold a high-performance version of the W124, the Mercedes-Benz 500 E (W124.036). The 500 E was created in close cooperation with Porsche. With its engineering department being fully occupied with the development of the new S-Class, Mercedes-Benz commissioned Porsche in 1989 to redesign the W124 chassis to shoehorn the 5.0L V8 used in the SL into it, along with the necessary changes on the suspension system and drive train. When the car was ready, it was found that its widened wings didn't fit through the W124 assembly line in Sindelfingen in three places. Hence Porsche was also commissioned to assemble the car. As a side-effect this arrangement provided workload for Porsche's plant, as the company was in crisis at the time, and its factory capacity was underutilized.\n" +
                        "\n" +
                        "During production Mercedes-Benz delivered parts to Porsche's \"Reutter-Bau\" plant in Zuffenhausen (an urban district of Stuttgart) where the 500 E chassis were hand-assembled. When finished the chassis were transported by truck to the Mercedes-Benz assembly plant in Sindelfingen to be painted. As soon as the paint was dry the varnished chassis were then shipped back to Porsche's \"Rössle-Bau\" in Zuffenhausen where the engine was put in and the car completed. For final inspection and delivery the vehicles again were transported to Sindelfingen. This process took a full 18 days per car.\n" +
                        "\n" +
                        "Design began in 1989. Called '500 E' through to model year 1993, for model year 1994 it was face-lifted along with the rest of the range and renamed to 'E 500'. The chassis constructed by Porsche was also used to produce the 400 E (W124.034), that was technically identical to its big brother, save its 4.2L V8 also used in the S-Class and some other minor changes. The 400 E (later renamed 'E 420') was produced in Sindelfingen, since it lacked the widened wings and thus was perfectly understated as it looked like one of its lesser siblings.\n" +
                        "\n" +
                        "In Germany, the 500 E first came on sale in late 1990, making its first appearance in Mercedes-Benz October 1, 1990 pricelist, with a retail price of DM134,520. By January 2, 1993, the price had risen to DM145,590, and would stay at it until the car went off the market in late 1994, it was last available in the August 1, 1994 pricelist. In the United States, the car first became available as a 1992 model with a retail price of $81,800 and was available until MY 1994.",
                "Mercedes-Benz 500E",
                ""));

        cars.get("Nik").add(new CarInfo(
                2,
                "images/demo/bmw_m5_e34.jpg",
                "The E34 generation of the M5 was produced from September 1988 to August 1995. Powered by the S38 straight-6 engine, an evolution of the previous generation's straight-6, it was initially produced in a sedan body style, with a LHD Touring (wagon/estate) version following in 1992.\n" +
                        "Production of M5 models began with the painted bodyshell of an E34 5 Series at the BMW Dingolfing plant. The shells were then transported to BMW M GmbH in Garching, where the car was assembled by hand over a period of two weeks. Only the South African M5 was entirely assembled at the Rosslyn, South Africa assembly plant from complete knock-down kits supplied from Garching, Germany.\n"+
                        "The M5 Touring, which was BMW M Division's first wagon as well as the last hand-built M car, saw 891 units produced. Total production of the E34 M5 was 12,254 units.\n" +
                        "\n" +
                        "Cosmetic changes to the exterior from the standard E34 included unique front and rear bumpers and side rocker panels, contributing to a drag coefficient of 0.32 (from 0.30), and interior updates included a unique gearshift surround and rear headrests.\n" +
                        "\n" +
                        "The second-generation M5 was introduced with the S38B36 engine, which generated 232 kW (315 PS; 311 hp) at 6,900 rpm and 360 N⋅m (266 lb⋅ft) of torque at 4,750 rpm, touting a factory 0-97 km/h (60 mph) acceleration figure of 6.3 seconds. Top speed was electronically limited to 250kmh – 155 mph. ",
                "BMW M5 e34",
                ""));

        cars.get("Nik").add(new CarInfo(
                3,
                "images/demo/audi-rs2.jpg",
                "The Audi RS2 Avant, usually known as Audi 80 RS2, was a limited edition, high-performance Audi five-door, five-seat estate car (station wagon), manufactured from March 1994 to July 1995. Collaboratively designed as a joint venture between Audi AG and Porsche and built on Audi's 80 Avant, designated internally as P1 (instead of B4/8C that it was based on). It was Audi's first \"RS\" vehicle, and the first of their high-performance Avants (Audi's name for an estate car or station wagon); it used the most powerful and most thoroughly developed version of Audi's inline-five cylinder turbocharged internal combustion engine.\n" +
                        "\n" +
                        "Although it was not widely exported outside of Europe, except for a few to Hong Kong, South Africa, Brazil, and New Zealand, the RS2 has amassed a cult following worldwide, and it is often regarded as being the vehicle that finally firmly established Audi as a producer of practical high-performance vehicles: its estate body, seating for five persons, and Audi's 'trademark' quattro permanent four-wheel-drive system as standard made it usable as a comfortable daily driver, even in poor weather conditions. ",
                "AUDI RS2",
                ""));
    }

    public List<CarInfo> getCarsByUsername(String username) {
        return cars.get(username);
    }
}

