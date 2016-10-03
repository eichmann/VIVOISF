package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013EditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013EditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013EditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013EditorListIterator theIAO_0000013EditorListIterator = (IAO_0000013EditorListIterator)findAncestorWithClass(this, IAO_0000013EditorListIterator.class);
			pageContext.getOut().print(theIAO_0000013EditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for editorList tag ");
		}
		return SKIP_BODY;
	}
}
