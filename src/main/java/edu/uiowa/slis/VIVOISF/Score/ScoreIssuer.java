package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreIssuerIterator theScoreIssuerIterator = (ScoreIssuerIterator)findAncestorWithClass(this, ScoreIssuerIterator.class);
			pageContext.getOut().print(theScoreIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for issuer tag ");
		}
		return SKIP_BODY;
	}
}

