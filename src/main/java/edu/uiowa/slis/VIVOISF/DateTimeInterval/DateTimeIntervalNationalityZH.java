package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNationalityZHIterator theDateTimeInterval = (DateTimeIntervalNationalityZHIterator)findAncestorWithClass(this, DateTimeIntervalNationalityZHIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

