package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			if (!theNonAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonAcademicPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			return theNonAcademicPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NonAcademicPosition theNonAcademicPosition = (NonAcademicPosition)findAncestorWithClass(this, NonAcademicPosition.class);
			theNonAcademicPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for label tag ");
		}
	}
}

