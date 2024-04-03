package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    List<GoldMedal> getAllByOrderByYearAsc();

    List<GoldMedal> getAllByOrderByYearDesc();

    int countByCountry(String country);

    int countBySeason(String season);

    int countByCountryAndGender(String country, String gender);

    List<GoldMedal> getByCountryAndSeasonOrderByYear(String country, String season);

    List<GoldMedal> getByCountryOrderByYearAsc(String country);

    List<GoldMedal> getByCountryOrderByYearDesc(String country);

    List<GoldMedal> getByCountryOrderBySeasonAsc(String country);

    List<GoldMedal> getByCountryOrderBySeasonDesc(String country);

    List<GoldMedal> getByCountryOrderByCityAsc(String country);

    List<GoldMedal> getByCountryOrderByCityDesc(String country);

    List<GoldMedal> getByCountryOrderByNameAsc(String country);

    List<GoldMedal> getByCountryOrderByNameDesc(String country);

    List<GoldMedal> getByCountryOrderByEventAsc(String country);

    List<GoldMedal> getByCountryOrderByEventDesc(String country);
}
