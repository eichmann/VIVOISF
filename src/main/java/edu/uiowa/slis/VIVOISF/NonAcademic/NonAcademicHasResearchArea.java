package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicHasResearchAreaIterator theNonAcademicHasResearchAreaIterator = (NonAcademicHasResearchAreaIterator)findAncestorWithClass(this, NonAcademicHasResearchAreaIterator.class);
			pageContext.getOut().print(theNonAcademicHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

