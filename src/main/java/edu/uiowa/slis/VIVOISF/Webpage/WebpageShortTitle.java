package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageShortTitleIterator theWebpage = (WebpageShortTitleIterator)findAncestorWithClass(this, WebpageShortTitleIterator.class);
			pageContext.getOut().print(theWebpage.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

