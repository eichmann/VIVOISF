package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeCurrencyIterator thespecial_group = (special_groupCodeCurrencyIterator)findAncestorWithClass(this, special_groupCodeCurrencyIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

