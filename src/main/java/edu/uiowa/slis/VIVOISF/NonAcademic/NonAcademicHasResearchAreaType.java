package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicHasResearchAreaIterator theNonAcademicHasResearchAreaIterator = (NonAcademicHasResearchAreaIterator)findAncestorWithClass(this, NonAcademicHasResearchAreaIterator.class);
			pageContext.getOut().print(theNonAcademicHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

