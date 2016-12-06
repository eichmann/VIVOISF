package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasTitleIterator theEditorshipHasTitleIterator = (EditorshipHasTitleIterator)findAncestorWithClass(this, EditorshipHasTitleIterator.class);
			pageContext.getOut().print(theEditorshipHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

