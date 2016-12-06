package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038NameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038NameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038NameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038NameCurrencyENIterator theBFO_0000038 = (BFO_0000038NameCurrencyENIterator)findAncestorWithClass(this, BFO_0000038NameCurrencyENIterator.class);
			pageContext.getOut().print(theBFO_0000038.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

