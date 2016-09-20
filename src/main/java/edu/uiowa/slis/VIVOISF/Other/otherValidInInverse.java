package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(otherValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherValidInInverseIterator theotherValidInInverseIterator = (otherValidInInverseIterator)findAncestorWithClass(this, otherValidInInverseIterator.class);
			pageContext.getOut().print(theotherValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing other for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for validIn tag ");
		}
		return SKIP_BODY;
	}
}

