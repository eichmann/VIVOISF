package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedTopObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedTopObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedTopObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedTopObjectPropertyInverseIterator thedisputedTopObjectPropertyInverseIterator = (disputedTopObjectPropertyInverseIterator)findAncestorWithClass(this, disputedTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thedisputedTopObjectPropertyInverseIterator.getTopObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

