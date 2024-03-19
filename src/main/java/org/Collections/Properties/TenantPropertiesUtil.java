package org.Collections.Properties;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TenantPropertiesUtil {
    //This method is to read just one tenant
    public static Tenant loadTenantDetails() {
        //we are creating an obj and load all the properties into it
        Properties properties = new Properties();
        try {

            properties.load(TenantPropertiesUtil.class.getResourceAsStream("/Tenant.properties"));
        } catch (IOException e) {
            System.out.println("The file cannot be loaded" + e);
        }
        //creating new obj and assigning to get the details here
        Tenant tenant = new Tenant();
        tenant.setName(properties.getProperty("tenant.name"));
        tenant.setEmail(properties.getProperty("tenant.email"));
        tenant.setCity(properties.getProperty("tenant.city"));
        return tenant;
    }
   //this method is to read list of tenants
    public static List<Tenant> loadAllTenants(){
        Properties p = new Properties();
        List<Tenant> list = new ArrayList<>();
        try{
            p.load(TenantPropertiesUtil.class.getResourceAsStream("/tenant.properties"));
            for(int i =0;i<=1;i++) {
                Tenant tenant = new Tenant();

                tenant.setName(p.getProperty("tenant["+i+"].name"));
                tenant.setEmail(p.getProperty("tenant["+i+"].email"));
                tenant.setEmail(p.getProperty("tenant["+i+"].city"));
                list.add(tenant);

            }
        }catch (IOException e){
            System.out.println("File cannot be read"+e);
        }
        return list;



    }
}
