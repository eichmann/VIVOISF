package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillInformationResourceSupportedByIterator theBillInformationResourceSupportedByIterator = (BillInformationResourceSupportedByIterator)findAncestorWithClass(this, BillInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBillInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

