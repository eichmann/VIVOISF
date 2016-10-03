package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptContributorListIterator theManuscriptContributorListIterator = (ManuscriptContributorListIterator)findAncestorWithClass(this, ManuscriptContributorListIterator.class);
			pageContext.getOut().print(theManuscriptContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

