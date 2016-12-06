package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			if (!theFacultyAdministrativePosition.commitNeeded) {
				pageContext.getOut().print(theFacultyAdministrativePosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			return theFacultyAdministrativePosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			theFacultyAdministrativePosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hideFromDisplay tag ");
		}
	}
}

