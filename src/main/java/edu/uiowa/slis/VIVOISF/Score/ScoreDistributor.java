package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreDistributorIterator theScoreDistributorIterator = (ScoreDistributorIterator)findAncestorWithClass(this, ScoreDistributorIterator.class);
			pageContext.getOut().print(theScoreDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for distributor tag ");
		}
		return SKIP_BODY;
	}
}

