package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardReproducesIterator theStandardReproducesIterator = (StandardReproducesIterator)findAncestorWithClass(this, StandardReproducesIterator.class);
			pageContext.getOut().print(theStandardReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

