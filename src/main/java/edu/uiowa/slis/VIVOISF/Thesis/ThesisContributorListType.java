package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisContributorListIterator theThesisContributorListIterator = (ThesisContributorListIterator)findAncestorWithClass(this, ThesisContributorListIterator.class);
			pageContext.getOut().print(theThesisContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

