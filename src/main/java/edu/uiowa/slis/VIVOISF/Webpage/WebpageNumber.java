package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageNumberIterator theWebpage = (WebpageNumberIterator)findAncestorWithClass(this, WebpageNumberIterator.class);
			pageContext.getOut().print(theWebpage.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for number tag ");
		}
		return SKIP_BODY;
	}
}

