package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicOrcidIdIterator theNonAcademic = (NonAcademicOrcidIdIterator)findAncestorWithClass(this, NonAcademicOrcidIdIterator.class);
			pageContext.getOut().print(theNonAcademic.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

