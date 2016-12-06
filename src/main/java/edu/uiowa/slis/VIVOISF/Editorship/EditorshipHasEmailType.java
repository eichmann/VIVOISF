package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasEmailIterator theEditorshipHasEmailIterator = (EditorshipHasEmailIterator)findAncestorWithClass(this, EditorshipHasEmailIterator.class);
			pageContext.getOut().print(theEditorshipHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

