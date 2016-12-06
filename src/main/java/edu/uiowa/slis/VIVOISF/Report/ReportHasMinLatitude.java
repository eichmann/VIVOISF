package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHasMinLatitudeIterator theReport = (ReportHasMinLatitudeIterator)findAncestorWithClass(this, ReportHasMinLatitudeIterator.class);
			pageContext.getOut().print(theReport.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

