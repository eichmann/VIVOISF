package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsitePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsitePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsitePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsitePmidIterator theWebsite = (WebsitePmidIterator)findAncestorWithClass(this, WebsitePmidIterator.class);
			pageContext.getOut().print(theWebsite.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for pmid tag ");
		}
		return SKIP_BODY;
	}
}

