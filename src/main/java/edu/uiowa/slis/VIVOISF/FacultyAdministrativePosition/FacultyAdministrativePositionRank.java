package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRankIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionRankIterator)findAncestorWithClass(this, FacultyAdministrativePositionRankIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

