package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteCodenIterator theWebsite = (WebsiteCodenIterator)findAncestorWithClass(this, WebsiteCodenIterator.class);
			pageContext.getOut().print(theWebsite.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for coden tag ");
		}
		return SKIP_BODY;
	}
}

