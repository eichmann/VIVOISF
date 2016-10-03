package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentEditorListIterator thePatentEditorListIterator = (PatentEditorListIterator)findAncestorWithClass(this, PatentEditorListIterator.class);
			pageContext.getOut().print(thePatentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for editorList tag ");
		}
		return SKIP_BODY;
	}
}

