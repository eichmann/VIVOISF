package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicERACommonsIdIterator theNonAcademic = (NonAcademicERACommonsIdIterator)findAncestorWithClass(this, NonAcademicERACommonsIdIterator.class);
			pageContext.getOut().print(theNonAcademic.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

