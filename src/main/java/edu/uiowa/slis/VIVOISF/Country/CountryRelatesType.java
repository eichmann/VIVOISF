package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryRelatesIterator theCountryRelatesIterator = (CountryRelatesIterator)findAncestorWithClass(this, CountryRelatesIterator.class);
			pageContext.getOut().print(theCountryRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for relates tag ");
		}
		return SKIP_BODY;
	}
}

