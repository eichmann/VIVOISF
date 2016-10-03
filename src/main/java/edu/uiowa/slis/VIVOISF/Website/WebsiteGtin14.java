package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteGtin14Iterator theWebsite = (WebsiteGtin14Iterator)findAncestorWithClass(this, WebsiteGtin14Iterator.class);
			pageContext.getOut().print(theWebsite.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

