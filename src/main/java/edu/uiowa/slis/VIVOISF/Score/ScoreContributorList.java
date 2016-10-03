package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreContributorListIterator theScoreContributorListIterator = (ScoreContributorListIterator)findAncestorWithClass(this, ScoreContributorListIterator.class);
			pageContext.getOut().print(theScoreContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

