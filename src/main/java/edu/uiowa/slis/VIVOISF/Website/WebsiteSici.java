package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteSici currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteSiciIterator theWebsite = (WebsiteSiciIterator)findAncestorWithClass(this, WebsiteSiciIterator.class);
			pageContext.getOut().print(theWebsite.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for sici tag ");
		}
		return SKIP_BODY;
	}
}

