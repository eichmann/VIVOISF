package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpagePageStartIterator theWebpage = (WebpagePageStartIterator)findAncestorWithClass(this, WebpagePageStartIterator.class);
			pageContext.getOut().print(theWebpage.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

