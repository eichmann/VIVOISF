package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasURLIterator theEditorshipHasURLIterator = (EditorshipHasURLIterator)findAncestorWithClass(this, EditorshipHasURLIterator.class);
			pageContext.getOut().print(theEditorshipHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

