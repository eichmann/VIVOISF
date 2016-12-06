package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyITIterator theterritory = (territoryNameCurrencyITIterator)findAncestorWithClass(this, territoryNameCurrencyITIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

