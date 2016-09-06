package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageReproducedInIterator theWebpageReproducedInIterator = (WebpageReproducedInIterator)findAncestorWithClass(this, WebpageReproducedInIterator.class);
			pageContext.getOut().print(theWebpageReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

