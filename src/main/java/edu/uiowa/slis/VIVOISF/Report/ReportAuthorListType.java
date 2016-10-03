package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportAuthorListIterator theReportAuthorListIterator = (ReportAuthorListIterator)findAncestorWithClass(this, ReportAuthorListIterator.class);
			pageContext.getOut().print(theReportAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for authorList tag ");
		}
		return SKIP_BODY;
	}
}

