package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptContributorListIterator theExcerptContributorListIterator = (ExcerptContributorListIterator)findAncestorWithClass(this, ExcerptContributorListIterator.class);
			pageContext.getOut().print(theExcerptContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

