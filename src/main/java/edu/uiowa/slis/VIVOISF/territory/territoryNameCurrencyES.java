package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyESIterator theterritory = (territoryNameCurrencyESIterator)findAncestorWithClass(this, territoryNameCurrencyESIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

