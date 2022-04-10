import converter.CSVConverter;
import converter.Converter;
import converter.JsonConverter;
import employees.ITGuy;
import employees.ProjectManager;

public class Cliente {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();


        ITGuy it = new ITGuy("Leno Lima", 32, 4000d);
        ProjectManager pm = new ProjectManager("SEI LA", 40 , 50000d);


        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));

    }
}
