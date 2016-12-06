package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListENIterator theCompany = (CompanyNameListENIterator)findAncestorWithClass(this, CompanyNameListENIterator.class);
			pageContext.getOut().print(theCompany.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

