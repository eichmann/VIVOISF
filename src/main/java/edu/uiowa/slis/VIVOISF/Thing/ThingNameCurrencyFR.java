package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyFRIterator theThing = (ThingNameCurrencyFRIterator)findAncestorWithClass(this, ThingNameCurrencyFRIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

