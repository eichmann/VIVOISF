package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyRelatesIterator theCompanyRelatesIterator = (CompanyRelatesIterator)findAncestorWithClass(this, CompanyRelatesIterator.class);
			pageContext.getOut().print(theCompanyRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for relates tag ");
		}
		return SKIP_BODY;
	}
}

