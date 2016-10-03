package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportIsbn10Iterator theReport = (ReportIsbn10Iterator)findAncestorWithClass(this, ReportIsbn10Iterator.class);
			pageContext.getOut().print(theReport.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

