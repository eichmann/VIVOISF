package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreDistributorIterator theScoreDistributorIterator = (ScoreDistributorIterator)findAncestorWithClass(this, ScoreDistributorIterator.class);
			pageContext.getOut().print(theScoreDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for distributor tag ");
		}
		return SKIP_BODY;
	}
}

