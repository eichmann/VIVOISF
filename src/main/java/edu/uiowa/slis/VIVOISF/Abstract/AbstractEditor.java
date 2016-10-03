package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractEditorIterator theAbstractEditorIterator = (AbstractEditorIterator)findAncestorWithClass(this, AbstractEditorIterator.class);
			pageContext.getOut().print(theAbstractEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for editor tag ");
		}
		return SKIP_BODY;
	}
}

