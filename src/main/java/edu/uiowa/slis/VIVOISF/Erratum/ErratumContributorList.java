package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumContributorListIterator theErratumContributorListIterator = (ErratumContributorListIterator)findAncestorWithClass(this, ErratumContributorListIterator.class);
			pageContext.getOut().print(theErratumContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

