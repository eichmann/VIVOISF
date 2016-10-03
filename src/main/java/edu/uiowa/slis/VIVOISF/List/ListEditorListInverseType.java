package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListEditorListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListEditorListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ListEditorListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListEditorListInverseIterator theListEditorListInverseIterator = (ListEditorListInverseIterator)findAncestorWithClass(this, ListEditorListInverseIterator.class);
			pageContext.getOut().print(theListEditorListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing List for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for editorList tag ");
		}
		return SKIP_BODY;
	}
}

