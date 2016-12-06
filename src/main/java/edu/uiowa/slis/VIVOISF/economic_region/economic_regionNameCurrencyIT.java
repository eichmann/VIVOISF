package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyITIterator theeconomic_region = (economic_regionNameCurrencyITIterator)findAncestorWithClass(this, economic_regionNameCurrencyITIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

