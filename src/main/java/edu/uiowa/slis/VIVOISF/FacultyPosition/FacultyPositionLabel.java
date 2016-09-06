package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			if (!theFacultyPosition.commitNeeded) {
				pageContext.getOut().print(theFacultyPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			return theFacultyPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			theFacultyPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for label tag ");
		}
	}
}

