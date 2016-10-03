package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreContributorListIterator theScoreContributorListIterator = (ScoreContributorListIterator)findAncestorWithClass(this, ScoreContributorListIterator.class);
			pageContext.getOut().print(theScoreContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

