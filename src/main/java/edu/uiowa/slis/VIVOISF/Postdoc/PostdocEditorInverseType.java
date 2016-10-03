package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocEditorInverseIterator thePostdocEditorInverseIterator = (PostdocEditorInverseIterator)findAncestorWithClass(this, PostdocEditorInverseIterator.class);
			pageContext.getOut().print(thePostdocEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for editor tag ");
		}
		return SKIP_BODY;
	}
}

