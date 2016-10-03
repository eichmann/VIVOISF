package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePages currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpagePagesIterator theWebpage = (WebpagePagesIterator)findAncestorWithClass(this, WebpagePagesIterator.class);
			pageContext.getOut().print(theWebpage.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for pages tag ");
		}
		return SKIP_BODY;
	}
}

