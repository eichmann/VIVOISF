package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaValidUntilIterator theArea = (AreaValidUntilIterator)findAncestorWithClass(this, AreaValidUntilIterator.class);
			pageContext.getOut().print(theArea.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

