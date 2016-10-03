package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterContributorListIterator theLetterContributorListIterator = (LetterContributorListIterator)findAncestorWithClass(this, LetterContributorListIterator.class);
			pageContext.getOut().print(theLetterContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

