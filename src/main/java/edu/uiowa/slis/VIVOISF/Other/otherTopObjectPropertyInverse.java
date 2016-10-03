package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherTopObjectPropertyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherTopObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(otherTopObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherTopObjectPropertyInverseIterator theotherTopObjectPropertyInverseIterator = (otherTopObjectPropertyInverseIterator)findAncestorWithClass(this, otherTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theotherTopObjectPropertyInverseIterator.getTopObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing other for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

