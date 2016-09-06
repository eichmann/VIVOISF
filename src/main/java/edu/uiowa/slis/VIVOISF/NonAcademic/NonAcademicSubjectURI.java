package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for subjectURI tag ");
		}
	}
}

