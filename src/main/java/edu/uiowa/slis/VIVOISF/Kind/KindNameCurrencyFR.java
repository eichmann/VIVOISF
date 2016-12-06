package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyFRIterator theKind = (KindNameCurrencyFRIterator)findAncestorWithClass(this, KindNameCurrencyFRIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

