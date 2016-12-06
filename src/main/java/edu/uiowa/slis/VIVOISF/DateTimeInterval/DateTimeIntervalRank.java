package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRank currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRankIterator theDateTimeInterval = (DateTimeIntervalRankIterator)findAncestorWithClass(this, DateTimeIntervalRankIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for rank tag ");
		}
		return SKIP_BODY;
	}
}

