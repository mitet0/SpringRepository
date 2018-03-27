package translator;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Mitet0 on 3/27/2018
 */
@Service
public class TranslatorService {

    private static final String ENCODING = "UTF-8";

    public String translate(String langFrom, String langTo, String word) throws Exception {

        String url = "https://translate.googleapis.com/translate_a/single?"+
                "client=gtx&"+
                "sl=" + langFrom +
                "&tl=" + langTo +
                "&dt=t&q=" + URLEncoder.encode(word, ENCODING);

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        String response = IOUtils.toString(con.getInputStream(), ENCODING);
        IOUtils.closeQuietly(con.getInputStream());

        return parseResult(response);
    }

    private String parseResult(String inputJson) throws Exception
    {

        JSONArray jsonArray = new JSONArray(inputJson);
        JSONArray jsonArray2 = (JSONArray) jsonArray.get(0);
        JSONArray jsonArray3 = (JSONArray) jsonArray2.get(0);

        return jsonArray3.get(0).toString();
    }
}
