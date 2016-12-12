package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeCurrencyIterator theSelf_governing = (Self_governingCodeCurrencyIterator)findAncestorWithClass(this, Self_governingCodeCurrencyIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

