package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRelatedByIterator theEditorshipRelatedByIterator = (EditorshipRelatedByIterator)findAncestorWithClass(this, EditorshipRelatedByIterator.class);
			pageContext.getOut().print(theEditorshipRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

