package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			if (!theScore.commitNeeded) {
				pageContext.getOut().print(theScore.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Score for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			return theScore.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Score for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			theScore.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Score for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for label tag ");
		}
	}
}

