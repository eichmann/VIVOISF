package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageCodenIterator theWebpage = (WebpageCodenIterator)findAncestorWithClass(this, WebpageCodenIterator.class);
			pageContext.getOut().print(theWebpage.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for coden tag ");
		}
		return SKIP_BODY;
	}
}

