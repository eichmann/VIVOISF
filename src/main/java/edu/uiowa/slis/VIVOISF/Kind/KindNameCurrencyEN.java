package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyENIterator theKind = (KindNameCurrencyENIterator)findAncestorWithClass(this, KindNameCurrencyENIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

