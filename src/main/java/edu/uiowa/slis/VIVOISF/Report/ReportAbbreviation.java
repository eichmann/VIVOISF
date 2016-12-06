package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for abbreviation tag ");
		}
	}
}

