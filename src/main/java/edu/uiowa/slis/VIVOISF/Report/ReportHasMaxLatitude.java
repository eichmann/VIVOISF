package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHasMaxLatitudeIterator theReport = (ReportHasMaxLatitudeIterator)findAncestorWithClass(this, ReportHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theReport.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

