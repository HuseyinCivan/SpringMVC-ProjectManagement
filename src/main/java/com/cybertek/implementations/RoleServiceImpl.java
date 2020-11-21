package com.cybertek.implementations;

import com.cybertek.dto.RoleDTO;
import com.cybertek.service.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {

    @Override
    public List<RoleDTO> findAll() {
        return null;
    }

    @Override
    public RoleDTO save(RoleDTO object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(RoleDTO object) {

    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
