package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyZHIterator theterritory = (territoryNameCurrencyZHIterator)findAncestorWithClass(this, territoryNameCurrencyZHIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

