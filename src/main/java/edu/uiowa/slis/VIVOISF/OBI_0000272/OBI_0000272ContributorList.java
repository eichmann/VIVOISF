package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272ContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272ContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272ContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ContributorListIterator theOBI_0000272ContributorListIterator = (OBI_0000272ContributorListIterator)findAncestorWithClass(this, OBI_0000272ContributorListIterator.class);
			pageContext.getOut().print(theOBI_0000272ContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

