package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHasMinLongitudeIterator theReport = (ReportHasMinLongitudeIterator)findAncestorWithClass(this, ReportHasMinLongitudeIterator.class);
			pageContext.getOut().print(theReport.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

