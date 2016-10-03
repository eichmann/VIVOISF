package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceContributorListIterator theReferenceSourceContributorListIterator = (ReferenceSourceContributorListIterator)findAncestorWithClass(this, ReferenceSourceContributorListIterator.class);
			pageContext.getOut().print(theReferenceSourceContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

