package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BillFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillFeaturesIterator theBillFeaturesIterator = (BillFeaturesIterator)findAncestorWithClass(this, BillFeaturesIterator.class);
			pageContext.getOut().print(theBillFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for features tag ");
		}
		return SKIP_BODY;
	}
}

