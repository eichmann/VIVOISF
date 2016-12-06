package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyITIterator theKind = (KindNameCurrencyITIterator)findAncestorWithClass(this, KindNameCurrencyITIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

