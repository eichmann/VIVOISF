package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsEditorIterator theProceedingsEditorIterator = (ProceedingsEditorIterator)findAncestorWithClass(this, ProceedingsEditorIterator.class);
			pageContext.getOut().print(theProceedingsEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for editor tag ");
		}
		return SKIP_BODY;
	}
}

