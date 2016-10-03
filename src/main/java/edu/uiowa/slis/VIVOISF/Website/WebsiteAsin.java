package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteAsinIterator theWebsite = (WebsiteAsinIterator)findAncestorWithClass(this, WebsiteAsinIterator.class);
			pageContext.getOut().print(theWebsite.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for asin tag ");
		}
		return SKIP_BODY;
	}
}

