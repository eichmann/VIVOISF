package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyFRIterator theContinent = (ContinentNameCurrencyFRIterator)findAncestorWithClass(this, ContinentNameCurrencyFRIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

