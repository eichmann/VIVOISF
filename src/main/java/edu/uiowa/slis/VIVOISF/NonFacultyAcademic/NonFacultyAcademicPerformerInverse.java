package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPerformerInverseIterator theNonFacultyAcademicPerformerInverseIterator = (NonFacultyAcademicPerformerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicPerformerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for performer tag ");
		}
		return SKIP_BODY;
	}
}

