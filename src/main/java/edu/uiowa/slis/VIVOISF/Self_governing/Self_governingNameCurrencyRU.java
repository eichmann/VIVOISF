package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyRUIterator theSelf_governing = (Self_governingNameCurrencyRUIterator)findAncestorWithClass(this, Self_governingNameCurrencyRUIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

