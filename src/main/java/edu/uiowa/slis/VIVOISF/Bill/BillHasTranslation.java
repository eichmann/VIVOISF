package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(BillHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillHasTranslationIterator theBillHasTranslationIterator = (BillHasTranslationIterator)findAncestorWithClass(this, BillHasTranslationIterator.class);
			pageContext.getOut().print(theBillHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

