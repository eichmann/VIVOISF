package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031NameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031NameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031NameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031NameCurrencyZHIterator theBFO_0000031 = (BFO_0000031NameCurrencyZHIterator)findAncestorWithClass(this, BFO_0000031NameCurrencyZHIterator.class);
			pageContext.getOut().print(theBFO_0000031.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

