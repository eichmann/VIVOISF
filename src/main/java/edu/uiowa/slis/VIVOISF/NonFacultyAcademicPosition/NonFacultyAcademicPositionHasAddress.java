package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasAddressIterator theNonFacultyAcademicPositionHasAddressIterator = (NonFacultyAcademicPositionHasAddressIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasAddressIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

