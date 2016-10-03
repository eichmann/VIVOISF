package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteIsbn13Iterator theWebsite = (WebsiteIsbn13Iterator)findAncestorWithClass(this, WebsiteIsbn13Iterator.class);
			pageContext.getOut().print(theWebsite.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

