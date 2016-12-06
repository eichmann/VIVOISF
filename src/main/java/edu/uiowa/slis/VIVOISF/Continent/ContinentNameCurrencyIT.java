package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyITIterator theContinent = (ContinentNameCurrencyITIterator)findAncestorWithClass(this, ContinentNameCurrencyITIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

