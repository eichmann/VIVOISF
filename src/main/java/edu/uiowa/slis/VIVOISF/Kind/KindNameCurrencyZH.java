package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyZHIterator theKind = (KindNameCurrencyZHIterator)findAncestorWithClass(this, KindNameCurrencyZHIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

