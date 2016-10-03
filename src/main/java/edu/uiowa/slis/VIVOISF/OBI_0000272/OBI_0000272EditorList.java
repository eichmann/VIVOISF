package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272EditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272EditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272EditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272EditorListIterator theOBI_0000272EditorListIterator = (OBI_0000272EditorListIterator)findAncestorWithClass(this, OBI_0000272EditorListIterator.class);
			pageContext.getOut().print(theOBI_0000272EditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for editorList tag ");
		}
		return SKIP_BODY;
	}
}

