package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolRelatedByIterator theSchoolRelatedByIterator = (SchoolRelatedByIterator)findAncestorWithClass(this, SchoolRelatedByIterator.class);
			pageContext.getOut().print(theSchoolRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing School for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

