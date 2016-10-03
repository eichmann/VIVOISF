package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteIsbn10Iterator theWebsite = (WebsiteIsbn10Iterator)findAncestorWithClass(this, WebsiteIsbn10Iterator.class);
			pageContext.getOut().print(theWebsite.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

