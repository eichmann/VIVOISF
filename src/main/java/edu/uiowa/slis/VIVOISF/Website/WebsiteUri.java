package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteUri currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteUriIterator theWebsite = (WebsiteUriIterator)findAncestorWithClass(this, WebsiteUriIterator.class);
			pageContext.getOut().print(theWebsite.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for uri tag ");
		}
		return SKIP_BODY;
	}
}

