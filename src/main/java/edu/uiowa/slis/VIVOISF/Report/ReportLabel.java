package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for label tag ");
		}
	}
}

