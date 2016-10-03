package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteEditorIterator theStatuteEditorIterator = (StatuteEditorIterator)findAncestorWithClass(this, StatuteEditorIterator.class);
			pageContext.getOut().print(theStatuteEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for editor tag ");
		}
		return SKIP_BODY;
	}
}

