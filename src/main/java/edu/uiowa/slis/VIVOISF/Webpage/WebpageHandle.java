package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageHandleIterator theWebpage = (WebpageHandleIterator)findAncestorWithClass(this, WebpageHandleIterator.class);
			pageContext.getOut().print(theWebpage.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for handle tag ");
		}
		return SKIP_BODY;
	}
}

