package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasTelephoneIterator theNonFacultyAcademicPositionHasTelephoneIterator = (NonFacultyAcademicPositionHasTelephoneIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasTelephoneIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

