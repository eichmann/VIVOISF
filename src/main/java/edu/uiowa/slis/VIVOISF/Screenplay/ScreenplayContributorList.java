package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayContributorListIterator theScreenplayContributorListIterator = (ScreenplayContributorListIterator)findAncestorWithClass(this, ScreenplayContributorListIterator.class);
			pageContext.getOut().print(theScreenplayContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

