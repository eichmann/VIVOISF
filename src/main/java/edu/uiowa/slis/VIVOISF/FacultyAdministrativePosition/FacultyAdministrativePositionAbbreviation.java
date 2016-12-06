package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			if (!theFacultyAdministrativePosition.commitNeeded) {
				pageContext.getOut().print(theFacultyAdministrativePosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			return theFacultyAdministrativePosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyAdministrativePosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			theFacultyAdministrativePosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for abbreviation tag ");
		}
	}
}

