package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationEditorListIterator theLegislationEditorListIterator = (LegislationEditorListIterator)findAncestorWithClass(this, LegislationEditorListIterator.class);
			pageContext.getOut().print(theLegislationEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for editorList tag ");
		}
		return SKIP_BODY;
	}
}

