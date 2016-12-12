package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherValidSinceIterator theOther = (OtherValidSinceIterator)findAncestorWithClass(this, OtherValidSinceIterator.class);
			pageContext.getOut().print(theOther.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for validSince tag ");
		}
		return SKIP_BODY;
	}
}

