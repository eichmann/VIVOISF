package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ContributorListIterator theIAO_0000013ContributorListIterator = (IAO_0000013ContributorListIterator)findAncestorWithClass(this, IAO_0000013ContributorListIterator.class);
			pageContext.getOut().print(theIAO_0000013ContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

