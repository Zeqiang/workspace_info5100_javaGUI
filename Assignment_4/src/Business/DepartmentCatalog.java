/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class DepartmentCatalog {
 
    private ArrayList<Department> departmentCatalog;
    
    public DepartmentCatalog() {
        departmentCatalog = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentCatalog() {
        return departmentCatalog;
    }
    
    public Department addDepartment(){
        Department department = new Department();
        departmentCatalog.add(department);
        return department;
    }
    
    public void removeDepartment(Department dept){
        departmentCatalog.remove(dept);
    }
}
