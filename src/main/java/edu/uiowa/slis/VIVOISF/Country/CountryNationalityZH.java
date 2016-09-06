package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityZHIterator theCountry = (CountryNationalityZHIterator)findAncestorWithClass(this, CountryNationalityZHIterator.class);
			pageContext.getOut().print(theCountry.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

