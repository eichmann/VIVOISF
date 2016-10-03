package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportEditionIterator theReport = (ReportEditionIterator)findAncestorWithClass(this, ReportEditionIterator.class);
			pageContext.getOut().print(theReport.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for edition tag ");
		}
		return SKIP_BODY;
	}
}

