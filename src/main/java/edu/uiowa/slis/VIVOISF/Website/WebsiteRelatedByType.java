package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteRelatedByIterator theWebsiteRelatedByIterator = (WebsiteRelatedByIterator)findAncestorWithClass(this, WebsiteRelatedByIterator.class);
			pageContext.getOut().print(theWebsiteRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

