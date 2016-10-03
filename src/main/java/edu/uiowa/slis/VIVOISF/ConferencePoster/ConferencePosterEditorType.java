package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterEditorIterator theConferencePosterEditorIterator = (ConferencePosterEditorIterator)findAncestorWithClass(this, ConferencePosterEditorIterator.class);
			pageContext.getOut().print(theConferencePosterEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for editor tag ");
		}
		return SKIP_BODY;
	}
}

