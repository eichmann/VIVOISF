package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRankIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionRankIterator)findAncestorWithClass(this, NonFacultyAcademicPositionRankIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

