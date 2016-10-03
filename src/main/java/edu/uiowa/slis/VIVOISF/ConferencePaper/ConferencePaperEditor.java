package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperEditorIterator theConferencePaperEditorIterator = (ConferencePaperEditorIterator)findAncestorWithClass(this, ConferencePaperEditorIterator.class);
			pageContext.getOut().print(theConferencePaperEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for editor tag ");
		}
		return SKIP_BODY;
	}
}

