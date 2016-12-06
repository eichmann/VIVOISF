package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportAgriculturalAreaTotalIterator theReport = (ReportAgriculturalAreaTotalIterator)findAncestorWithClass(this, ReportAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theReport.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

