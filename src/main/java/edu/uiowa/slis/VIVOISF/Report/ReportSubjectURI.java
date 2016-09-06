package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for subjectURI tag ");
		}
	}
}

