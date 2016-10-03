package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardShortDescriptionIterator theStandard = (StandardShortDescriptionIterator)findAncestorWithClass(this, StandardShortDescriptionIterator.class);
			pageContext.getOut().print(theStandard.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

