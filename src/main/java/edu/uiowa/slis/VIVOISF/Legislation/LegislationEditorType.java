package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationEditorIterator theLegislationEditorIterator = (LegislationEditorIterator)findAncestorWithClass(this, LegislationEditorIterator.class);
			pageContext.getOut().print(theLegislationEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for editor tag ");
		}
		return SKIP_BODY;
	}
}

