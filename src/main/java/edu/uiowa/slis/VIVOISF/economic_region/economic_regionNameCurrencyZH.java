package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyZHIterator theeconomic_region = (economic_regionNameCurrencyZHIterator)findAncestorWithClass(this, economic_regionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

