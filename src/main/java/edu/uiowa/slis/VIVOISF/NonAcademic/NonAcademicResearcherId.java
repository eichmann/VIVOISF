package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicResearcherIdIterator theNonAcademic = (NonAcademicResearcherIdIterator)findAncestorWithClass(this, NonAcademicResearcherIdIterator.class);
			pageContext.getOut().print(theNonAcademic.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

