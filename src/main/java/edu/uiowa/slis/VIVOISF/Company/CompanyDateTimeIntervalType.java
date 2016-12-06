package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyDateTimeIntervalIterator theCompanyDateTimeIntervalIterator = (CompanyDateTimeIntervalIterator)findAncestorWithClass(this, CompanyDateTimeIntervalIterator.class);
			pageContext.getOut().print(theCompanyDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

