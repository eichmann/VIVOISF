package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for overview tag ");
		}
	}
}

