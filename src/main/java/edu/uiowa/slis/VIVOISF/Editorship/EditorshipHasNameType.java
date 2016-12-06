package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasNameIterator theEditorshipHasNameIterator = (EditorshipHasNameIterator)findAncestorWithClass(this, EditorshipHasNameIterator.class);
			pageContext.getOut().print(theEditorshipHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasName tag ");
		}
		return SKIP_BODY;
	}
}

