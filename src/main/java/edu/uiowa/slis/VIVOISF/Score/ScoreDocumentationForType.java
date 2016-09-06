package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreDocumentationForIterator theScoreDocumentationForIterator = (ScoreDocumentationForIterator)findAncestorWithClass(this, ScoreDocumentationForIterator.class);
			pageContext.getOut().print(theScoreDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

