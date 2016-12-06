package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRankIterator theFacultyPosition = (FacultyPositionRankIterator)findAncestorWithClass(this, FacultyPositionRankIterator.class);
			pageContext.getOut().print(theFacultyPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

