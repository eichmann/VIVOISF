package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicDirectorInverseIterator theNonAcademicDirectorInverseIterator = (NonAcademicDirectorInverseIterator)findAncestorWithClass(this, NonAcademicDirectorInverseIterator.class);
			pageContext.getOut().print(theNonAcademicDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for director tag ");
		}
		return SKIP_BODY;
	}
}

