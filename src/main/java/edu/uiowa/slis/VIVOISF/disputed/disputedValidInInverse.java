package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedValidInInverseIterator thedisputedValidInInverseIterator = (disputedValidInInverseIterator)findAncestorWithClass(this, disputedValidInInverseIterator.class);
			pageContext.getOut().print(thedisputedValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for validIn tag ");
		}
		return SKIP_BODY;
	}
}

