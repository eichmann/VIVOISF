package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLandAreaTotalIterator theReport = (ReportLandAreaTotalIterator)findAncestorWithClass(this, ReportLandAreaTotalIterator.class);
			pageContext.getOut().print(theReport.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

