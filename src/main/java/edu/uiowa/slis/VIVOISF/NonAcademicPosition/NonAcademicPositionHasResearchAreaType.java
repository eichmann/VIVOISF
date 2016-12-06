package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasResearchAreaIterator theNonAcademicPositionHasResearchAreaIterator = (NonAcademicPositionHasResearchAreaIterator)findAncestorWithClass(this, NonAcademicPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

