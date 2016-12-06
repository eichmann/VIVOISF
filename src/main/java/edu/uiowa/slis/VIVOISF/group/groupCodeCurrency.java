package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(groupCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupCodeCurrencyIterator thegroup = (groupCodeCurrencyIterator)findAncestorWithClass(this, groupCodeCurrencyIterator.class);
			pageContext.getOut().print(thegroup.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing group for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

