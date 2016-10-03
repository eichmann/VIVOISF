package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteIdentifierIterator theWebsite = (WebsiteIdentifierIterator)findAncestorWithClass(this, WebsiteIdentifierIterator.class);
			pageContext.getOut().print(theWebsite.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for identifier tag ");
		}
		return SKIP_BODY;
	}
}

