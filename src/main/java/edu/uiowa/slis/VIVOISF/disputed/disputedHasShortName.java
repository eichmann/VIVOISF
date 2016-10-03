package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasShortNameIterator thedisputed = (disputedHasShortNameIterator)findAncestorWithClass(this, disputedHasShortNameIterator.class);
			pageContext.getOut().print(thedisputed.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

