package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillTranslatorIterator theBillTranslatorIterator = (BillTranslatorIterator)findAncestorWithClass(this, BillTranslatorIterator.class);
			pageContext.getOut().print(theBillTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for translator tag ");
		}
		return SKIP_BODY;
	}
}

