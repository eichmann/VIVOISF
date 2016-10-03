package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardShortTitleIterator theStandard = (StandardShortTitleIterator)findAncestorWithClass(this, StandardShortTitleIterator.class);
			pageContext.getOut().print(theStandard.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

