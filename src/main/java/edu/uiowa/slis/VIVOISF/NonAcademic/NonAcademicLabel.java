package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for label tag ");
		}
	}
}

