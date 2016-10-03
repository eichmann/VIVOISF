package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedTopDataPropertyIterator thedisputed = (disputedTopDataPropertyIterator)findAncestorWithClass(this, disputedTopDataPropertyIterator.class);
			pageContext.getOut().print(thedisputed.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

