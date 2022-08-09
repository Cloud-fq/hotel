package org.oozzr.hotel.service;

import org.oozzr.hotel.pojo.Hotel;
import org.oozzr.hotel.pojo.PageResult;
import org.oozzr.hotel.pojo.RequestParams;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface IHotelService extends IService<Hotel> {
    PageResult search(RequestParams params);

    Map<String, List<String>> getFilters(RequestParams params);

    List<String> getSuggestion(String key);

    void deleteById(Long hotelId);

    void saveById(Long hotelId);
}
