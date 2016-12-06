package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNationalityZHIterator theDateTimeValue = (DateTimeValueNationalityZHIterator)findAncestorWithClass(this, DateTimeValueNationalityZHIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

