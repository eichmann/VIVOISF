package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			if (!theCourtReporter.commitNeeded) {
				pageContext.getOut().print(theCourtReporter.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			return theCourtReporter.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CourtReporter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CourtReporter theCourtReporter = (CourtReporter)findAncestorWithClass(this, CourtReporter.class);
			theCourtReporter.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for label tag ");
		}
	}
}

