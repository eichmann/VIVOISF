package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreEditorIterator theScoreEditorIterator = (ScoreEditorIterator)findAncestorWithClass(this, ScoreEditorIterator.class);
			pageContext.getOut().print(theScoreEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for editor tag ");
		}
		return SKIP_BODY;
	}
}

