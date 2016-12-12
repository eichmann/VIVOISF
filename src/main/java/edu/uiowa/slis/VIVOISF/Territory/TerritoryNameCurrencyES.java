package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyESIterator theTerritory = (TerritoryNameCurrencyESIterator)findAncestorWithClass(this, TerritoryNameCurrencyESIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

