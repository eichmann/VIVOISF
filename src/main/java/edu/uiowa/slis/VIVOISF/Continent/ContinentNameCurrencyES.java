package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyESIterator theContinent = (ContinentNameCurrencyESIterator)findAncestorWithClass(this, ContinentNameCurrencyESIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

