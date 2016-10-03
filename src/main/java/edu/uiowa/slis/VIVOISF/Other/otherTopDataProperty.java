package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(otherTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherTopDataPropertyIterator theother = (otherTopDataPropertyIterator)findAncestorWithClass(this, otherTopDataPropertyIterator.class);
			pageContext.getOut().print(theother.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing other for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

