package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpagePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpagePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpagePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpagePageEndIterator theWebpage = (WebpagePageEndIterator)findAncestorWithClass(this, WebpagePageEndIterator.class);
			pageContext.getOut().print(theWebpage.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

