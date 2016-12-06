package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyENIterator theeconomic_region = (economic_regionNameCurrencyENIterator)findAncestorWithClass(this, economic_regionNameCurrencyENIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

