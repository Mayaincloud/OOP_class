import repository.StudentRepository;
import service.StudentService;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactoryImpl;
import terminal.CommandParserImpl;
import db.StudentTable;


public class Main {

    public static void main(String[] args) {


        TerminalReader.getInstance(new CommandParserImpl(),
                        new CommandExecutableFactoryImpl(new StudentService(new StudentRepository(new StudentTable()))))
                .getRun();
    }
}
