package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyFRIterator theeconomic_region = (economic_regionNameCurrencyFRIterator)findAncestorWithClass(this, economic_regionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

