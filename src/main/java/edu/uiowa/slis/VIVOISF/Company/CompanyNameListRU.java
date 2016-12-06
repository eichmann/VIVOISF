package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListRUIterator theCompany = (CompanyNameListRUIterator)findAncestorWithClass(this, CompanyNameListRUIterator.class);
			pageContext.getOut().print(theCompany.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

