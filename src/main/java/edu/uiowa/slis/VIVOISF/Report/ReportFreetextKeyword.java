package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportFreetextKeywordIterator theReport = (ReportFreetextKeywordIterator)findAncestorWithClass(this, ReportFreetextKeywordIterator.class);
			pageContext.getOut().print(theReport.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

