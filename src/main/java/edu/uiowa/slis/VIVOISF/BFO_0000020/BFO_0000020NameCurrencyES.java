package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020NameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020NameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020NameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020NameCurrencyESIterator theBFO_0000020 = (BFO_0000020NameCurrencyESIterator)findAncestorWithClass(this, BFO_0000020NameCurrencyESIterator.class);
			pageContext.getOut().print(theBFO_0000020.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

