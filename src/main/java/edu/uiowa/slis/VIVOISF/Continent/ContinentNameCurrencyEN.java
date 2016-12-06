package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyENIterator theContinent = (ContinentNameCurrencyENIterator)findAncestorWithClass(this, ContinentNameCurrencyENIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

