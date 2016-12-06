package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyARIterator theThing = (ThingNameCurrencyARIterator)findAncestorWithClass(this, ThingNameCurrencyARIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

