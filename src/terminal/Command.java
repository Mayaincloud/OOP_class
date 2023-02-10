package terminal;

import java.util.ArrayList;

import java.util.List;

public class Command {
    private final static String ADD = "/add";
    private final static String DEL = "/delete";
    private static final String DELBYFN = "/deleteByFirstName";
    private static final String DELETEBYGROUPANDBIRTH = "/deleteByCroupNumberAndYearOfBirth";
    private final List<String> arguments;
    private final String mainFirstCommand;

    public Command(List<String> commands) {
        this.arguments = new ArrayList<>(commands);
        this.mainFirstCommand = commands.get(0);



    }


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

