package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreFeaturesIterator theScoreFeaturesIterator = (ScoreFeaturesIterator)findAncestorWithClass(this, ScoreFeaturesIterator.class);
			pageContext.getOut().print(theScoreFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for features tag ");
		}
		return SKIP_BODY;
	}
}

