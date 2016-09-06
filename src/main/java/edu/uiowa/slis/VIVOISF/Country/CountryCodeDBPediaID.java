package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeDBPediaIDIterator theCountry = (CountryCodeDBPediaIDIterator)findAncestorWithClass(this, CountryCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theCountry.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

