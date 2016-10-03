package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisContributorListIterator theThesisContributorListIterator = (ThesisContributorListIterator)findAncestorWithClass(this, ThesisContributorListIterator.class);
			pageContext.getOut().print(theThesisContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

