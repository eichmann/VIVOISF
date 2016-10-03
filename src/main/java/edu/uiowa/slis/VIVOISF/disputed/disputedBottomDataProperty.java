package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedBottomDataPropertyIterator thedisputed = (disputedBottomDataPropertyIterator)findAncestorWithClass(this, disputedBottomDataPropertyIterator.class);
			pageContext.getOut().print(thedisputed.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

