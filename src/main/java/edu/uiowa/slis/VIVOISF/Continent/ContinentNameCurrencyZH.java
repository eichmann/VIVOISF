package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyZHIterator theContinent = (ContinentNameCurrencyZHIterator)findAncestorWithClass(this, ContinentNameCurrencyZHIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

