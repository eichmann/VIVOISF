package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for researchOverview tag ");
		}
	}
}

