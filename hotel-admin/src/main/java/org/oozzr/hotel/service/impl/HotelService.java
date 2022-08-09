package org.oozzr.hotel.service.impl;

import org.oozzr.hotel.mapper.HotelMapper;
import org.oozzr.hotel.pojo.Hotel;
import org.oozzr.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}
