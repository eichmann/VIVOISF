package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004NameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004NameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004NameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004NameCurrencyZHIterator theBFO_0000004 = (BFO_0000004NameCurrencyZHIterator)findAncestorWithClass(this, BFO_0000004NameCurrencyZHIterator.class);
			pageContext.getOut().print(theBFO_0000004.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

