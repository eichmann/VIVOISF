package edu.uiowa.slis.VIVOISF.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardReceiptRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardReceiptRO_0000056Iterator theAwardReceiptRO_0000056Iterator = (AwardReceiptRO_0000056Iterator)findAncestorWithClass(this, AwardReceiptRO_0000056Iterator.class);
			pageContext.getOut().print(theAwardReceiptRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

