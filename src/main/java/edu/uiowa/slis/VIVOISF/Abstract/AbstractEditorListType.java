package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractEditorListIterator theAbstractEditorListIterator = (AbstractEditorListIterator)findAncestorWithClass(this, AbstractEditorListIterator.class);
			pageContext.getOut().print(theAbstractEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for editorList tag ");
		}
		return SKIP_BODY;
	}
}

