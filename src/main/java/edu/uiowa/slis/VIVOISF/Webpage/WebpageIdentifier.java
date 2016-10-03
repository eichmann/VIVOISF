package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WebpageIdentifierIterator theWebpage = (WebpageIdentifierIterator)findAncestorWithClass(this, WebpageIdentifierIterator.class);
			pageContext.getOut().print(theWebpage.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for identifier tag ");
		}
		return SKIP_BODY;
	}
}

