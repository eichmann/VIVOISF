package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasShortNameIterator theother = (otherHasShortNameIterator)findAncestorWithClass(this, otherHasShortNameIterator.class);
			pageContext.getOut().print(theother.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

