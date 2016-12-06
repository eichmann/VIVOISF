package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportRankIterator theReport = (ReportRankIterator)findAncestorWithClass(this, ReportRankIterator.class);
			pageContext.getOut().print(theReport.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for rank tag ");
		}
		return SKIP_BODY;
	}
}

