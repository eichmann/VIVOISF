package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteUpcIterator theWebsite = (WebsiteUpcIterator)findAncestorWithClass(this, WebsiteUpcIterator.class);
			pageContext.getOut().print(theWebsite.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for upc tag ");
		}
		return SKIP_BODY;
	}
}

