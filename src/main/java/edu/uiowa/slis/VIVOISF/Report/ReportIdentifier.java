package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportIdentifierIterator theReport = (ReportIdentifierIterator)findAncestorWithClass(this, ReportIdentifierIterator.class);
			pageContext.getOut().print(theReport.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for identifier tag ");
		}
		return SKIP_BODY;
	}
}

