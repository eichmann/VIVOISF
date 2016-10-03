package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardContributorListIterator theStandardContributorListIterator = (StandardContributorListIterator)findAncestorWithClass(this, StandardContributorListIterator.class);
			pageContext.getOut().print(theStandardContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

