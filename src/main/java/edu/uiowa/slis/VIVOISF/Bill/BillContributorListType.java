package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BillContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillContributorListIterator theBillContributorListIterator = (BillContributorListIterator)findAncestorWithClass(this, BillContributorListIterator.class);
			pageContext.getOut().print(theBillContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

