package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentContributorListIterator thePatentContributorListIterator = (PatentContributorListIterator)findAncestorWithClass(this, PatentContributorListIterator.class);
			pageContext.getOut().print(thePatentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

