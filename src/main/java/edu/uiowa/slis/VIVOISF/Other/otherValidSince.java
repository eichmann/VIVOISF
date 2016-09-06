package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(otherValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherValidSinceIterator theother = (otherValidSinceIterator)findAncestorWithClass(this, otherValidSinceIterator.class);
			pageContext.getOut().print(theother.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing other for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for validSince tag ");
		}
		return SKIP_BODY;
	}
}

