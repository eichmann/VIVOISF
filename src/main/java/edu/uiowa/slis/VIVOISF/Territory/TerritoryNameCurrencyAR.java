package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyARIterator theTerritory = (TerritoryNameCurrencyARIterator)findAncestorWithClass(this, TerritoryNameCurrencyARIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

