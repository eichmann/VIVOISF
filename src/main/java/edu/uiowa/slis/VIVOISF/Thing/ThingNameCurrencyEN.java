package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyENIterator theThing = (ThingNameCurrencyENIterator)findAncestorWithClass(this, ThingNameCurrencyENIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

