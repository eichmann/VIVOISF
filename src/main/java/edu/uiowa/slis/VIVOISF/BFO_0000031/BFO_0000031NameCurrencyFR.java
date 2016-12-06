package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031NameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031NameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031NameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031NameCurrencyFRIterator theBFO_0000031 = (BFO_0000031NameCurrencyFRIterator)findAncestorWithClass(this, BFO_0000031NameCurrencyFRIterator.class);
			pageContext.getOut().print(theBFO_0000031.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

