package dao;

import org.springframework.stereotype.Repository;
import pojo.Advertisement;

@Repository
public interface AdvertisementMapper {
    String addAdvertise(Advertisement advertisement);
    String deleteAdvertise(Advertisement advertisement);
    String deleteAdvertise(String ad_id);
}
