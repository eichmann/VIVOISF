package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageNumPagesIterator theWebpage = (WebpageNumPagesIterator)findAncestorWithClass(this, WebpageNumPagesIterator.class);
			pageContext.getOut().print(theWebpage.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for numPages tag ");
		}
		return SKIP_BODY;
	}
}

