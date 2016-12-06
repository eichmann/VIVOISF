package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHasMaxLongitudeIterator theReport = (ReportHasMaxLongitudeIterator)findAncestorWithClass(this, ReportHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theReport.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

