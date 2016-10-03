package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreProducerIterator theScoreProducerIterator = (ScoreProducerIterator)findAncestorWithClass(this, ScoreProducerIterator.class);
			pageContext.getOut().print(theScoreProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for producer tag ");
		}
		return SKIP_BODY;
	}
}

