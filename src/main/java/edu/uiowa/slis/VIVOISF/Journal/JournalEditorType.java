package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalEditorIterator theJournalEditorIterator = (JournalEditorIterator)findAncestorWithClass(this, JournalEditorIterator.class);
			pageContext.getOut().print(theJournalEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for editor tag ");
		}
		return SKIP_BODY;
	}
}

