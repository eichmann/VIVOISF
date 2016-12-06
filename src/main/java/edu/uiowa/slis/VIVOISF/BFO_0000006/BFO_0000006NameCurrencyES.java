package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006NameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006NameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006NameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006NameCurrencyESIterator theBFO_0000006 = (BFO_0000006NameCurrencyESIterator)findAncestorWithClass(this, BFO_0000006NameCurrencyESIterator.class);
			pageContext.getOut().print(theBFO_0000006.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

