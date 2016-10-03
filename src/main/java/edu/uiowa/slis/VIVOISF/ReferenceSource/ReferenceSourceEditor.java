package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceEditorIterator theReferenceSourceEditorIterator = (ReferenceSourceEditorIterator)findAncestorWithClass(this, ReferenceSourceEditorIterator.class);
			pageContext.getOut().print(theReferenceSourceEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for editor tag ");
		}
		return SKIP_BODY;
	}
}

