package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationEditorIterator theLegislationEditorIterator = (LegislationEditorIterator)findAncestorWithClass(this, LegislationEditorIterator.class);
			pageContext.getOut().print(theLegislationEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for editor tag ");
		}
		return SKIP_BODY;
	}
}

