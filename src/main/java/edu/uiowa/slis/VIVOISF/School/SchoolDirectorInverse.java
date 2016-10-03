package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolDirectorInverseIterator theSchoolDirectorInverseIterator = (SchoolDirectorInverseIterator)findAncestorWithClass(this, SchoolDirectorInverseIterator.class);
			pageContext.getOut().print(theSchoolDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for director tag ");
		}
		return SKIP_BODY;
	}
}

