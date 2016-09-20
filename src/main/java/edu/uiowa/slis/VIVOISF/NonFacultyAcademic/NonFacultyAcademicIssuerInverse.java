package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicIssuerInverseIterator theNonFacultyAcademicIssuerInverseIterator = (NonFacultyAcademicIssuerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicIssuerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for issuer tag ");
		}
		return SKIP_BODY;
	}
}

