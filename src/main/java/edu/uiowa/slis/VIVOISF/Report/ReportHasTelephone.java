package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasTelephoneIterator theReportHasTelephoneIterator = (ReportHasTelephoneIterator)findAncestorWithClass(this, ReportHasTelephoneIterator.class);
			pageContext.getOut().print(theReportHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

