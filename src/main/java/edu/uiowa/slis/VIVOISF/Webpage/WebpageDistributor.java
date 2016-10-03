package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageDistributorIterator theWebpageDistributorIterator = (WebpageDistributorIterator)findAncestorWithClass(this, WebpageDistributorIterator.class);
			pageContext.getOut().print(theWebpageDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for distributor tag ");
		}
		return SKIP_BODY;
	}
}

