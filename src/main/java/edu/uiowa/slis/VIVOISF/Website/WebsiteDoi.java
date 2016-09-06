package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteDoiIterator theWebsite = (WebsiteDoiIterator)findAncestorWithClass(this, WebsiteDoiIterator.class);
			pageContext.getOut().print(theWebsite.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for doi tag ");
		}
		return SKIP_BODY;
	}
}

