package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			if (!theFacultyPosition.commitNeeded) {
				pageContext.getOut().print(theFacultyPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			return theFacultyPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			theFacultyPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for abbreviation tag ");
		}
	}
}

