package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardReproducedInIterator theStandardReproducedInIterator = (StandardReproducedInIterator)findAncestorWithClass(this, StandardReproducedInIterator.class);
			pageContext.getOut().print(theStandardReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

