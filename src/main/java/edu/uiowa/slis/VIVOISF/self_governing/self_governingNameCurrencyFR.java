package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyFRIterator theself_governing = (self_governingNameCurrencyFRIterator)findAncestorWithClass(this, self_governingNameCurrencyFRIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

