import java.net.URL;
import java.util.ArrayList;
import java.io.*;

/**
* @author Jacob Smith
* WebCrawler collects the urls of web pages that can be reached in a single
* step from a particular starting web page
*/


public class WebCrawler {

	private ArrayList<String> collectUrls;

	public static ArrayList<String> collectUrls(String urlString) {

		ArrayList<String> matchUrls = readUrls(
				urlString); /**
							 * ArrayList for matchUrls to readUrls
							 */
		ArrayList<String> foundUrls = splitUrlsFirst(
				matchUrls); /**
							 * ArrayList for found urls to split the match urls
							 * first
							 */
		ArrayList<String> collectedUrls = splitUrlsSecond(
				foundUrls); /**
							 * ArrayList for collected urls to split the found
							 * urls second
							 */

		return collectedUrls;
	}

	public static ArrayList<String> readUrls(String urlString) {

		ArrayList<String> matchingUrls = new ArrayList<String>();
		String readString;

		try { // Html.java sourced code in order to to read in urls
			URL url = new URL(urlString);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream())); /**
										 * Omitted Buffered out reader
										 */
			while ((readString = in
					.readLine()) != null) { /**
											 * And omitted counter since they're
											 * not used
											 */
				if (readString.contains("<a href=\"")) {
					matchingUrls.add(readString);
				}
			}

		} catch (IOException e) { // Catch an input/output exception
			System.out.println("no access to URL: " + urlString);
		}
		return matchingUrls;
	}

	public static ArrayList<String> splitUrlsFirst(ArrayList<String> myUrls) {

		ArrayList<String> foundUrls = new ArrayList<String>();
		String[] output = new String[0];
		String regex = "<a href=\""; // Created String regex to remove unwanted bits

		for (String url : myUrls) { // For each loop to split the url with the regex characters
			output = url.split(regex);
			foundUrls.add(output[1]); // Regex1 which splits the first urls
		}
		return foundUrls;
	}

	public static ArrayList<String> splitUrlsSecond(ArrayList<String> myUrls) {

		ArrayList<String> foundUrls = new ArrayList<String>();
		String[] output = new String[0];
		String regex = "\">"; // Created String regex to remove unwanted bits

		for (String url : myUrls) { // For each loop to split the url with the regex characters
			output = url.split(regex);
			foundUrls.add(output[0]); // regex2 which splits the second urls
		}
		return foundUrls;
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
