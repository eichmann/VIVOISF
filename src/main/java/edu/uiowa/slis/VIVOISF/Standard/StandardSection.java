package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardSection currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardSectionIterator theStandard = (StandardSectionIterator)findAncestorWithClass(this, StandardSectionIterator.class);
			pageContext.getOut().print(theStandard.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for section tag ");
		}
		return SKIP_BODY;
	}
}

