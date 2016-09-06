package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteTheAbstractIterator theWebsite = (WebsiteTheAbstractIterator)findAncestorWithClass(this, WebsiteTheAbstractIterator.class);
			pageContext.getOut().print(theWebsite.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

