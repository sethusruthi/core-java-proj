package org.Collections.Properties;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tenant {
    private String name;
    private String email;
    private String city;

}
//want to read the tenant file and convert it into tenant obj