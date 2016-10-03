package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedValidUntilIterator thedisputed = (disputedValidUntilIterator)findAncestorWithClass(this, disputedValidUntilIterator.class);
			pageContext.getOut().print(thedisputed.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

