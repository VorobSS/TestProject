
import org.springframework.web.client.RestTemplate;

public class GetCurrency {

    public static void main(String args[]) {
    }

    public String getCurrency(String id) {


    RestTemplate restTemplate = new RestTemplate();
        String page = restTemplate.getForObject("http://priceticker.exactpro.com/RestInstruments/json/price?id=" + id, String.class);
        System.out.println(page);

        return  page;

    }
}

