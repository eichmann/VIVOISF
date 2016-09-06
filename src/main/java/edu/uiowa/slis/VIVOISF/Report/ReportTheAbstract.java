package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportTheAbstractIterator theReport = (ReportTheAbstractIterator)findAncestorWithClass(this, ReportTheAbstractIterator.class);
			pageContext.getOut().print(theReport.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

