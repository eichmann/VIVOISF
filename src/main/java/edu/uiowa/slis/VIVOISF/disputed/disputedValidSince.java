package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedValidSinceIterator thedisputed = (disputedValidSinceIterator)findAncestorWithClass(this, disputedValidSinceIterator.class);
			pageContext.getOut().print(thedisputed.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for validSince tag ");
		}
		return SKIP_BODY;
	}
}

