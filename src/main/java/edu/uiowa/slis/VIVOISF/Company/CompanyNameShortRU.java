package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortRUIterator theCompany = (CompanyNameShortRUIterator)findAncestorWithClass(this, CompanyNameShortRUIterator.class);
			pageContext.getOut().print(theCompany.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

