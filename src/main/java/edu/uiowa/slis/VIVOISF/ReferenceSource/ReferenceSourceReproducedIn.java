package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceReproducedInIterator theReferenceSourceReproducedInIterator = (ReferenceSourceReproducedInIterator)findAncestorWithClass(this, ReferenceSourceReproducedInIterator.class);
			pageContext.getOut().print(theReferenceSourceReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

