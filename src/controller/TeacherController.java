package controller;

import dto.Teacher;
import service.DataService;
import service.TeacherService;

public class TeacherController implements Controller<Teacher, Integer> {

    private final DataService<Teacher> teacherService;

    public TeacherController(DataService<Teacher> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

}