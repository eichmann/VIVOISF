package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003NameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003NameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003NameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003NameCurrencyFRIterator theBFO_0000003 = (BFO_0000003NameCurrencyFRIterator)findAncestorWithClass(this, BFO_0000003NameCurrencyFRIterator.class);
			pageContext.getOut().print(theBFO_0000003.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

