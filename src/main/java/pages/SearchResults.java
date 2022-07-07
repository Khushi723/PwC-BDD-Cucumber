package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseClass;
import utils.WebDriverExtensions;

/**
 * Contains methods for the Search Results page
 * @author khushdeep.gupta
 *
 */
public class SearchResults extends BaseClass
{
	By searchResultsLocator = By.cssSelector("h2[search-results]");
	private WebElement searchResults   = driver.findElement(searchResultsLocator);
	
/** 
 * Method to get the page title
 * @return
 */
	public String getPageTitle()
    {
    	WebDriverExtensions.ElementIsVisible(searchResultsLocator); // The search operation is slow which takes apprx time to search from 150-200 sec. So the wait time is higher here. 
    	return driver.getTitle();       
    }
/**
 * Method to count the number of search results
 * @return
 */
	public String countSearchResults()
    {       
        return searchResults.getAttribute("search-results");       
    }
}
