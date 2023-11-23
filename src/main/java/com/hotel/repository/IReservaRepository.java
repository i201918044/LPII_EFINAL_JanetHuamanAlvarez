package com.hotel.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hotel.model.ReservaModel;
import com.hotel.service.ReservaService;
@Service

public interface IReservaRepository extends JpaRepository<ReservaModel, Integer> {

}
