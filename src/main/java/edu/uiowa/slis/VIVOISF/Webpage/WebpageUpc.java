package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageUpcIterator theWebpage = (WebpageUpcIterator)findAncestorWithClass(this, WebpageUpcIterator.class);
			pageContext.getOut().print(theWebpage.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for upc tag ");
		}
		return SKIP_BODY;
	}
}

