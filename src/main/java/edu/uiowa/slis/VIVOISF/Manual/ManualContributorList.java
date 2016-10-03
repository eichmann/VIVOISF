package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualContributorListIterator theManualContributorListIterator = (ManualContributorListIterator)findAncestorWithClass(this, ManualContributorListIterator.class);
			pageContext.getOut().print(theManualContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

