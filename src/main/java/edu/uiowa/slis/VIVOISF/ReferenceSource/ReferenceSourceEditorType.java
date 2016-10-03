package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceEditorIterator theReferenceSourceEditorIterator = (ReferenceSourceEditorIterator)findAncestorWithClass(this, ReferenceSourceEditorIterator.class);
			pageContext.getOut().print(theReferenceSourceEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for editor tag ");
		}
		return SKIP_BODY;
	}
}

