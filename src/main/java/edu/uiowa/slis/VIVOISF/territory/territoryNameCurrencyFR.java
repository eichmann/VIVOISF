package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyFRIterator theterritory = (territoryNameCurrencyFRIterator)findAncestorWithClass(this, territoryNameCurrencyFRIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

