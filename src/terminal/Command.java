package terminal;

import java.util.List;

public class Command {
    private final static String ADD = "/add";
    private final static String DEL = "/delete";

    private static final String DELBYFN = "/deleteByFirstName";
    private static final String DELETEBYGROUPANDBIRTH = "/deleteByCroupNumberAndYearOfBirth";
    private List<String> arguments;
    private String mainFirstCommand;

    public String getFirstArgument(){
        return arguments.get(0);
    }

    public boolean isCreateCommand(){

        return mainFirstCommand.equals(ADD);
    }
    public boolean isCDeleteCommand(){

        return mainFirstCommand.equals(DEL);
    }
    public boolean isDeleteStudentByFirstNameCommand(){

        return mainFirstCommand.equals(DELBYFN);
    }
    public boolean isDeleteByGroupNumberAndYearOfBirthCommand(){

        return mainFirstCommand.equals(DELETEBYGROUPANDBIRTH);
    }
}
