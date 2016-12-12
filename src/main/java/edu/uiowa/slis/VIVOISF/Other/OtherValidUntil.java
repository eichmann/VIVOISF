package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherValidUntilIterator theOther = (OtherValidUntilIterator)findAncestorWithClass(this, OtherValidUntilIterator.class);
			pageContext.getOut().print(theOther.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

