package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperEditorIterator theNewspaperEditorIterator = (NewspaperEditorIterator)findAncestorWithClass(this, NewspaperEditorIterator.class);
			pageContext.getOut().print(theNewspaperEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for editor tag ");
		}
		return SKIP_BODY;
	}
}

