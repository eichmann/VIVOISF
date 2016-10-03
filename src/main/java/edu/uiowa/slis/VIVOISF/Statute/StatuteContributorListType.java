package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteContributorListIterator theStatuteContributorListIterator = (StatuteContributorListIterator)findAncestorWithClass(this, StatuteContributorListIterator.class);
			pageContext.getOut().print(theStatuteContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

