package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageReproducesIterator theWebpageReproducesIterator = (WebpageReproducesIterator)findAncestorWithClass(this, WebpageReproducesIterator.class);
			pageContext.getOut().print(theWebpageReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

