package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRankIterator theNonAcademicPosition = (NonAcademicPositionRankIterator)findAncestorWithClass(this, NonAcademicPositionRankIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

