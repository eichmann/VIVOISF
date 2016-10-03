package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageUri currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageUriIterator theWebpage = (WebpageUriIterator)findAncestorWithClass(this, WebpageUriIterator.class);
			pageContext.getOut().print(theWebpage.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for uri tag ");
		}
		return SKIP_BODY;
	}
}

