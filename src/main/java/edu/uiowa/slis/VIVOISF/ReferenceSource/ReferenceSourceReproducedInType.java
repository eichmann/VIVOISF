package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceReproducedInIterator theReferenceSourceReproducedInIterator = (ReferenceSourceReproducedInIterator)findAncestorWithClass(this, ReferenceSourceReproducedInIterator.class);
			pageContext.getOut().print(theReferenceSourceReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

