package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasURLIterator theEditorshipHasURLIterator = (EditorshipHasURLIterator)findAncestorWithClass(this, EditorshipHasURLIterator.class);
			pageContext.getOut().print(theEditorshipHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

