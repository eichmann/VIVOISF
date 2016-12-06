package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRank currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRankIterator theDateTimeValue = (DateTimeValueRankIterator)findAncestorWithClass(this, DateTimeValueRankIterator.class);
			pageContext.getOut().print(theDateTimeValue.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for rank tag ");
		}
		return SKIP_BODY;
	}
}

