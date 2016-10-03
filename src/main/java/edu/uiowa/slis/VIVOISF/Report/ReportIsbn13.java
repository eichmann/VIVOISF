package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportIsbn13Iterator theReport = (ReportIsbn13Iterator)findAncestorWithClass(this, ReportIsbn13Iterator.class);
			pageContext.getOut().print(theReport.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

