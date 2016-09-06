package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for outreachOverview tag ");
		}
	}
}

