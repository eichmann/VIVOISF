package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyZHIterator theThing = (ThingNameCurrencyZHIterator)findAncestorWithClass(this, ThingNameCurrencyZHIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

