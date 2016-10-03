package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionEditorIterator theCollectionEditorIterator = (CollectionEditorIterator)findAncestorWithClass(this, CollectionEditorIterator.class);
			pageContext.getOut().print(theCollectionEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for editor tag ");
		}
		return SKIP_BODY;
	}
}

