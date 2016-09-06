package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BillTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillTranslationOfIterator theBillTranslationOfIterator = (BillTranslationOfIterator)findAncestorWithClass(this, BillTranslationOfIterator.class);
			pageContext.getOut().print(theBillTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

