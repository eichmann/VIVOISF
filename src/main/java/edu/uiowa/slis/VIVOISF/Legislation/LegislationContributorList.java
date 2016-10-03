package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationContributorListIterator theLegislationContributorListIterator = (LegislationContributorListIterator)findAncestorWithClass(this, LegislationContributorListIterator.class);
			pageContext.getOut().print(theLegislationContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

