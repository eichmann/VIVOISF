package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameCurrencyARIterator theKind = (KindNameCurrencyARIterator)findAncestorWithClass(this, KindNameCurrencyARIterator.class);
			pageContext.getOut().print(theKind.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

