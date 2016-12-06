package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyESIterator theKind = (KindNameCurrencyESIterator)findAncestorWithClass(this, KindNameCurrencyESIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

