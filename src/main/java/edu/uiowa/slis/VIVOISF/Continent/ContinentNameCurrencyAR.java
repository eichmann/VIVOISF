package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyARIterator theContinent = (ContinentNameCurrencyARIterator)findAncestorWithClass(this, ContinentNameCurrencyARIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

