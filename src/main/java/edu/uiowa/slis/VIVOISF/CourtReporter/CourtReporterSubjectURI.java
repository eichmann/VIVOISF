package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			if (!theCourtReporter.commitNeeded) {
				pageContext.getOut().print(theCourtReporter.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			return theCourtReporter.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CourtReporter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			theCourtReporter.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for subjectURI tag ");
		}
	}
}

