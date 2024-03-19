package org.Collections.EmployeeCurrencyJsonAssignment;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JsonReaderUtil {
//since we are reading the currency data to list we wroteList<currency>
    public List<Currency> loadCurrencies(){
   //This is where we should read the currency file
        ObjectMapper mapper = getObjectMapper();

        try{
            /*we are reading the data here and mapping it to string and currency(where we passed our requried variables)
            so we gave map(string,currency). new typereference is we get the values in that format.*/
            Map<String,Currency> map = mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/currencies.json"),
            new TypeReference<Map<String,Currency>>(){});
            //we are adding all those to the created list.
//           List<Currency> currencies= map.values().stream().toList();
//           System.out.println(currencies);
            return map.values().stream().toList();

        }catch (IOException e){
            System.out.println("Error reading"+e);
        }
        return Collections.EMPTY_LIST;
    }

    public List<Employee> loadEmployees(){
        ObjectMapper mapper = getObjectMapper();
        try {
            return mapper.readValue(JsonReaderUtil.class.getResourceAsStream("/Employee.json"),
                    new TypeReference<List< Employee>>() {});

        }catch (IOException e){
            System.out.println("Empty"+e);
        }
        return Collections.EMPTY_LIST;
    }
    public ObjectMapper getObjectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        //this is to if we find some unknown values in the Json file we are asking to ignore
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }


}
