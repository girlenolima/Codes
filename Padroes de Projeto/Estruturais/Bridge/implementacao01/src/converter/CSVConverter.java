package converter;

import employees.Employee;

public class CSVConverter implements Converter {



    @Override
    public String getEmployeeFormated(Employee emp) {
        return String.format("%s,%d,%.2f", emp.getName(), emp.getAge(), emp.getSalary());
    }
}
