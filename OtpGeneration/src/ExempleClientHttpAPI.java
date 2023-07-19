import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.util.Scanner;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.EncodingUtil;

public class ExempleClientHttpAPI {

	private static final String URL = "https://api.smsmode.com/http/1.6/";
	private static final String PATH_SEND_SMS = "sendSMS.do";
	private static final String PATH_SEND_SMS_BATCH = "sendSMSBatch.do";
	private static final String ERROR_FILE = "The specified file does not exist";

	// send SMS with GET method
	public String sendSmsGet(String accessToken, String message, String destinataires, String emetteur,
			String optionStop) throws IOException {

		HttpClient httpclient = new DefaultHttpClient();
		String finalUrl = URL + PATH_SEND_SMS;
		GetMethod httpMethod = new GetMethod(finalUrl);
		httpMethod.addRequestHeader("Content-Type", "plain/text; charset=ISO-8859-15");

		NameValuePair[] params = { new NameValuePair("accessToken", accessToken), new NameValuePair("message", message),
				new NameValuePair("numero", destinataires), new NameValuePair("emetteur", emetteur),
				new NameValuePair("stop", optionStop) };

		httpMethod.setQueryString(EncodingUtil.formUrlEncode(params, "ISO-8859-15"));
		httpClient.executeMethod(httpMethod);
		return convertToString(httpMethod.getResponseBodyAsStream());
	}

	// send SMS with POST method
	public String sendSmsPost(String accessToken, String message, String destinataires, String emetteur,
			String optionStop) throws IOException {
		HttpClient httpClient = new HttpClient();
		String finalUrl = URL + PATH_SEND_SMS;
		PostMethod httpMethod = new PostMethod(finalUrl);
		httpMethod.addRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=ISO-8859-15");

		NameValuePair[] params = { new NameValuePair("accessToken", accessToken), new NameValuePair("message", message),
				new NameValuePair("numero", destinataires), new NameValuePair("emetteur", emetteur),
				new NameValuePair("stop", optionStop) };

		httpMethod.setRequestBody(params);
		httpClient.executeMethod(httpMethod);
		return convertToString(httpMethod.getResponseBodyAsStream());
	}
// 
// // send SMS with POST method (Batch)
// public String sendSmsBatch(String accessToken, String batchFilePath, String optionStop) throws IOException {
//     File file = new File(batchFilePath);
//     if (!file.exists())
//         return ERROR_FILE;
// 
//     HttpClient httpClient = new HttpClient();
//     String finalUrl = URL + PATH_SEND_SMS_BATCH + "?accessToken=" + accessToken + "&stop=" + optionStop;
//     PostMethod httpMethod = new PostMethod(finalUrl);
// 
//     Part[] parts = new Part[1];
//     parts[0] = new FilePart(file.getName(), file, "text/csv", null);
// 
//     httpMethod.setRequestEntity(new MultipartRequestEntity(parts, httpMethod.getParams()));
//     httpClient.executeMethod(httpMethod);
//     return convertToString(httpMethod.getResponseBodyAsStream());
// }

	private String convertToString(InputStream stream) {
		Scanner sc = new Scanner(stream);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			sb.append(sc.nextLine());
		}
		return sb.toString();
	}
}