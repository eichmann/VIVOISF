package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeCurrencyIterator theKind = (KindCodeCurrencyIterator)findAncestorWithClass(this, KindCodeCurrencyIterator.class);
			pageContext.getOut().print(theKind.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

