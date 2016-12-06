package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyENIterator theterritory = (territoryNameCurrencyENIterator)findAncestorWithClass(this, territoryNameCurrencyENIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

