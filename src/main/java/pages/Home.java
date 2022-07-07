package pages;

import base.BaseClass;
import java.util.List;
import org.openqa.selenium.*;

/**
 * Contains the methods which are applicable on the Home page of the website.
 * @author khushdeep.gupta
 */
public class Home extends BaseClass
{
	private List<WebElement> divArticleColumns = driver.findElements(By.cssSelector("div.collectionv2__content > div[class^='headline_column']"));
	private WebElement siteTitle = driver.findElement(By.cssSelector("meta[property='og:title']"));
	private WebElement siteName = driver.findElement(By.cssSelector("meta[property='og:site_name']"));
	private WebElement subscribeLink  = driver.findElement(By.cssSelector("a[aria-controls = 'subscribe-subnav-4']"));
	private WebElement searchMagnifierIcon    = driver.findElement(By.cssSelector("div.nav-search > button.search-hide"));

/**
 * Generalized method to return the list of Column webelements on the Home page. 
 * @param columnName
 * @return List<WebElement>
 */
	private List<WebElement> articlesColumns(String columnName)
    {
        try
        {
              return driver.findElements(By.cssSelector("div.collectionv2__content > div[class='headline_"+ columnName + "'] > article"));
        }
        catch (Exception ex)
        {
            throw ex;
        }
    }

/**
 * Method to return the complete Website name
 * @return String
 */
	public String getCompleteWebSiteName()
	{
		return (siteName.getAttribute("content")).concat(siteTitle.getAttribute("content"));
	}
	
/**
 * Method to return the page title.
 * @return String
 */
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
/**
 * Method to count the number of columns of articles on the page. 
 * @return
 */
	public int countNumberOfColumns()
	{
		return divArticleColumns.size();
	}
	
/**
 * Generalized method to count the number of columns in any column
 * @param columnName
 * @return int
 */
	public int countColumnArticles(String columnName)
	{
		return articlesColumns(columnName).size();
	}
	
/**
 * Method to click on the Subscribe link
 */
	
	public void clickSubscribeLink()
    {
    	subscribeLink.click();
    }
	
/** Method to click on the Search icon
 */
	
	 public void performSearch()
	    {
	        searchMagnifierIcon.click();         
	    }
}
