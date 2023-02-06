package controller;

import dto.GroupStream;
import service.GroupStreamServiceImpl;

public class GroupStreamController implements Controller<GroupStream, Integer> {

    private final GroupStreamServiceImpl groupStreamServiceImpl;

    public GroupStreamController(GroupStreamServiceImpl groupStreamServiceImpl) {
        this.groupStreamServiceImpl = groupStreamServiceImpl;
    }

    @Override
    public GroupStream save(GroupStream groupStream) {
        return groupStreamServiceImpl.saveGroupStream(groupStream);
    }

    @Override
    public GroupStream findById(Integer id) {
        return groupStreamServiceImpl.findGroupStreamById(id);
    }

}
