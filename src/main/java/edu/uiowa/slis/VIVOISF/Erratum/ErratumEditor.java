package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumEditorIterator theErratumEditorIterator = (ErratumEditorIterator)findAncestorWithClass(this, ErratumEditorIterator.class);
			pageContext.getOut().print(theErratumEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for editor tag ");
		}
		return SKIP_BODY;
	}
}

