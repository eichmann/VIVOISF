package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasListNameIterator thedisputed = (disputedHasListNameIterator)findAncestorWithClass(this, disputedHasListNameIterator.class);
			pageContext.getOut().print(thedisputed.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

