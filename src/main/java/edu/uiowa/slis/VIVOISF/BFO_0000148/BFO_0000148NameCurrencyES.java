package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148NameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148NameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148NameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148NameCurrencyESIterator theBFO_0000148 = (BFO_0000148NameCurrencyESIterator)findAncestorWithClass(this, BFO_0000148NameCurrencyESIterator.class);
			pageContext.getOut().print(theBFO_0000148.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

