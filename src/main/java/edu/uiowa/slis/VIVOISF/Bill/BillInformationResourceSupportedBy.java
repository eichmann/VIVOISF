package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BillInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillInformationResourceSupportedByIterator theBillInformationResourceSupportedByIterator = (BillInformationResourceSupportedByIterator)findAncestorWithClass(this, BillInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBillInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

