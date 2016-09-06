package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptReproducesIterator theExcerptReproducesIterator = (ExcerptReproducesIterator)findAncestorWithClass(this, ExcerptReproducesIterator.class);
			pageContext.getOut().print(theExcerptReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

