package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageLocatorIterator theWebpage = (WebpageLocatorIterator)findAncestorWithClass(this, WebpageLocatorIterator.class);
			pageContext.getOut().print(theWebpage.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for locator tag ");
		}
		return SKIP_BODY;
	}
}

