package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteOwnerIterator theWebsiteOwnerIterator = (WebsiteOwnerIterator)findAncestorWithClass(this, WebsiteOwnerIterator.class);
			pageContext.getOut().print(theWebsiteOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for owner tag ");
		}
		return SKIP_BODY;
	}
}

