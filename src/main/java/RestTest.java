
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestTest {

    public static void main(String args[]) {
    }

    public Map restTest() {

        RestTemplate restTemplate = new RestTemplate();
        String page = restTemplate.getForObject("http://priceticker.exactpro.com/RestInstruments/json/instrumentList/", String.class);
        System.out.println(page);

        String tmp = page.replaceAll("[{}<\\\\>]", "");
        page = tmp;

        HashMap map = new HashMap();
        String[] subStr;
        String delimeter = ",";
        subStr = page.split(delimeter);
        for(int i = 0; i < subStr.length; i++) {
            String[] subStr1;
            String delimeter1 = ":";
            subStr1 = subStr[i].split(delimeter1);
            map.put(subStr1[0], subStr1[1]);

        }
        System.out.println(map);

        return map;

    }

}

