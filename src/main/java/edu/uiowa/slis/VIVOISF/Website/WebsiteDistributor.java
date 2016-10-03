package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteDistributorIterator theWebsiteDistributorIterator = (WebsiteDistributorIterator)findAncestorWithClass(this, WebsiteDistributorIterator.class);
			pageContext.getOut().print(theWebsiteDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for distributor tag ");
		}
		return SKIP_BODY;
	}
}

