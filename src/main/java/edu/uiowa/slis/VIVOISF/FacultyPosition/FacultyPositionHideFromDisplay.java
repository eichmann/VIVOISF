package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			if (!theFacultyPosition.commitNeeded) {
				pageContext.getOut().print(theFacultyPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			return theFacultyPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			FacultyPosition theFacultyPosition = (FacultyPosition)findAncestorWithClass(this, FacultyPosition.class);
			theFacultyPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hideFromDisplay tag ");
		}
	}
}

