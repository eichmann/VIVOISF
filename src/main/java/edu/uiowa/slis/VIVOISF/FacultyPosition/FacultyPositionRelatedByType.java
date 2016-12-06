package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRelatedByIterator theFacultyPositionRelatedByIterator = (FacultyPositionRelatedByIterator)findAncestorWithClass(this, FacultyPositionRelatedByIterator.class);
			pageContext.getOut().print(theFacultyPositionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
