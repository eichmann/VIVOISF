package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicScopusIdIterator theNonAcademic = (NonAcademicScopusIdIterator)findAncestorWithClass(this, NonAcademicScopusIdIterator.class);
			pageContext.getOut().print(theNonAcademic.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

