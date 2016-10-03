package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicDirectorInverseIterator theNonAcademicDirectorInverseIterator = (NonAcademicDirectorInverseIterator)findAncestorWithClass(this, NonAcademicDirectorInverseIterator.class);
			pageContext.getOut().print(theNonAcademicDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for director tag ");
		}
		return SKIP_BODY;
	}
}

