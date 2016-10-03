package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationOwnerInverseIterator theFoundationOwnerInverseIterator = (FoundationOwnerInverseIterator)findAncestorWithClass(this, FoundationOwnerInverseIterator.class);
			pageContext.getOut().print(theFoundationOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for owner tag ");
		}
		return SKIP_BODY;
	}
}

