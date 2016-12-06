package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyARIterator theeconomic_region = (economic_regionNameCurrencyARIterator)findAncestorWithClass(this, economic_regionNameCurrencyARIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

