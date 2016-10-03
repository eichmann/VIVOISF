package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationDirectorInverseIterator theFoundationDirectorInverseIterator = (FoundationDirectorInverseIterator)findAncestorWithClass(this, FoundationDirectorInverseIterator.class);
			pageContext.getOut().print(theFoundationDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for director tag ");
		}
		return SKIP_BODY;
	}
}

