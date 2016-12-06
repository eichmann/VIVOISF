package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			if (!theNonAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonAcademicPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			return theNonAcademicPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			theNonAcademicPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hideFromDisplay tag ");
		}
	}
}

