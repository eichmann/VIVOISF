package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsEditorIterator theProceedingsEditorIterator = (ProceedingsEditorIterator)findAncestorWithClass(this, ProceedingsEditorIterator.class);
			pageContext.getOut().print(theProceedingsEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for editor tag ");
		}
		return SKIP_BODY;
	}
}

