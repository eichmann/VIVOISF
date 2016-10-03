package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumEditorListIterator theErratumEditorListIterator = (ErratumEditorListIterator)findAncestorWithClass(this, ErratumEditorListIterator.class);
			pageContext.getOut().print(theErratumEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for editorList tag ");
		}
		return SKIP_BODY;
	}
}

