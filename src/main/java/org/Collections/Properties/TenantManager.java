package org.Collections.Properties;

import java.util.List;

public class TenantManager {
    public static void main(String []args){
        List<Tenant> tenant = TenantPropertiesUtil.loadAllTenants();
        System.out.println(tenant);


    }
}
