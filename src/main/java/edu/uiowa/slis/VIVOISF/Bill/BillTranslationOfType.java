package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillTranslationOfIterator theBillTranslationOfIterator = (BillTranslationOfIterator)findAncestorWithClass(this, BillTranslationOfIterator.class);
			pageContext.getOut().print(theBillTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

