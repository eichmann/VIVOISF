package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefEditorIterator theBriefEditorIterator = (BriefEditorIterator)findAncestorWithClass(this, BriefEditorIterator.class);
			pageContext.getOut().print(theBriefEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for editor tag ");
		}
		return SKIP_BODY;
	}
}

