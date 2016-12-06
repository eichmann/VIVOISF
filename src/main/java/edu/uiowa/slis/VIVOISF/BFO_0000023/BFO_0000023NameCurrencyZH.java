package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023NameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023NameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023NameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023NameCurrencyZHIterator theBFO_0000023 = (BFO_0000023NameCurrencyZHIterator)findAncestorWithClass(this, BFO_0000023NameCurrencyZHIterator.class);
			pageContext.getOut().print(theBFO_0000023.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

