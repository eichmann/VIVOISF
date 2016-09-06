package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceReproducesIterator theReferenceSourceReproducesIterator = (ReferenceSourceReproducesIterator)findAncestorWithClass(this, ReferenceSourceReproducesIterator.class);
			pageContext.getOut().print(theReferenceSourceReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

