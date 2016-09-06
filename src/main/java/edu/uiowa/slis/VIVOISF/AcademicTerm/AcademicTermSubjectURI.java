package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			if (!theAcademicTerm.commitNeeded) {
				pageContext.getOut().print(theAcademicTerm.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			return theAcademicTerm.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicTerm for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			theAcademicTerm.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for subjectURI tag ");
		}
	}
}

