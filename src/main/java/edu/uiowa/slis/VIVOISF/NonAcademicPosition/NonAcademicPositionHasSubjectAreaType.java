package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasSubjectAreaIterator theNonAcademicPositionHasSubjectAreaIterator = (NonAcademicPositionHasSubjectAreaIterator)findAncestorWithClass(this, NonAcademicPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

