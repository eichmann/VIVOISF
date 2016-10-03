package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebsiteHandleIterator theWebsite = (WebsiteHandleIterator)findAncestorWithClass(this, WebsiteHandleIterator.class);
			pageContext.getOut().print(theWebsite.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for handle tag ");
		}
		return SKIP_BODY;
	}
}

