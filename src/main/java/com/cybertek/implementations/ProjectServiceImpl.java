package com.cybertek.implementations;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO, String> implements ProjectService {
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(), object);
    }

    @Override
    public void update(ProjectDTO object) {
        super.update(object.getProjectCode(), object);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);

    }

    @Override
    public void delete(ProjectDTO object) {
        super.delete(object);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }
}
