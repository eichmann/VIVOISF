package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hideFromDisplay tag ");
		}
	}
}

