package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedBottomObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedBottomObjectPropertyInverseIterator thedisputedBottomObjectPropertyInverseIterator = (disputedBottomObjectPropertyInverseIterator)findAncestorWithClass(this, disputedBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thedisputedBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

