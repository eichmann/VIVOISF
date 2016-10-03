package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreEditorListIterator theScoreEditorListIterator = (ScoreEditorListIterator)findAncestorWithClass(this, ScoreEditorListIterator.class);
			pageContext.getOut().print(theScoreEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for editorList tag ");
		}
		return SKIP_BODY;
	}
}

