package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolCourtInverseIterator theSchoolCourtInverseIterator = (SchoolCourtInverseIterator)findAncestorWithClass(this, SchoolCourtInverseIterator.class);
			pageContext.getOut().print(theSchoolCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for court tag ");
		}
		return SKIP_BODY;
	}
}

