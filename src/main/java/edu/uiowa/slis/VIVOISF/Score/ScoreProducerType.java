package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreProducerIterator theScoreProducerIterator = (ScoreProducerIterator)findAncestorWithClass(this, ScoreProducerIterator.class);
			pageContext.getOut().print(theScoreProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for producer tag ");
		}
		return SKIP_BODY;
	}
}

