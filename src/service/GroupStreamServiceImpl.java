package service;

import dto.GroupStream;
import dto.comparators.GroupStreamComparator;
import repository.GroupStreamRepository;


import java.util.List;
import java.util.Collections;

public class GroupStreamServiceImpl implements GroupStreamService {

    private final GroupStreamRepository groupStreamRepository;

    public GroupStreamServiceImpl(GroupStreamRepository groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    public GroupStream findGroupStreamById(int id) {
        return groupStreamRepository.findById(id);
    }

    public void sortGroupStream(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    }

}