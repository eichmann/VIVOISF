package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteEditorListIterator theStatuteEditorListIterator = (StatuteEditorListIterator)findAncestorWithClass(this, StatuteEditorListIterator.class);
			pageContext.getOut().print(theStatuteEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for editorList tag ");
		}
		return SKIP_BODY;
	}
}

