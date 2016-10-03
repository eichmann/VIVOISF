package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPerformerInverseIterator theNonFacultyAcademicPerformerInverseIterator = (NonFacultyAcademicPerformerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicPerformerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for performer tag ");
		}
		return SKIP_BODY;
	}
}

