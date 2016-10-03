package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentEditorListIterator thePatentEditorListIterator = (PatentEditorListIterator)findAncestorWithClass(this, PatentEditorListIterator.class);
			pageContext.getOut().print(thePatentEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for editorList tag ");
		}
		return SKIP_BODY;
	}
}

