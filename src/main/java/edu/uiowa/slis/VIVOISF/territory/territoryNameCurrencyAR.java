package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryNameCurrencyARIterator theterritory = (territoryNameCurrencyARIterator)findAncestorWithClass(this, territoryNameCurrencyARIterator.class);
			pageContext.getOut().print(theterritory.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

