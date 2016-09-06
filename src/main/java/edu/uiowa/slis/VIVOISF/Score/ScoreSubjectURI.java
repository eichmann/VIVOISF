package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			if (!theScore.commitNeeded) {
				pageContext.getOut().print(theScore.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Score for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			return theScore.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Score for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Score theScore = (Score)findAncestorWithClass(this, Score.class);
			theScore.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Score for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for subjectURI tag ");
		}
	}
}

