package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			if (!theFacultyAdministrativePosition.commitNeeded) {
				pageContext.getOut().print(theFacultyAdministrativePosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			return theFacultyAdministrativePosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyAdministrativePosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FacultyAdministrativePosition theFacultyAdministrativePosition = (FacultyAdministrativePosition)findAncestorWithClass(this, FacultyAdministrativePosition.class);
			theFacultyAdministrativePosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for label tag ");
		}
	}
}

