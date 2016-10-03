package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageAsinIterator theWebpage = (WebpageAsinIterator)findAncestorWithClass(this, WebpageAsinIterator.class);
			pageContext.getOut().print(theWebpage.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for asin tag ");
		}
		return SKIP_BODY;
	}
}

