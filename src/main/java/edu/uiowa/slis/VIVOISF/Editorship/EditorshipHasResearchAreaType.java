package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipHasResearchAreaIterator theEditorshipHasResearchAreaIterator = (EditorshipHasResearchAreaIterator)findAncestorWithClass(this, EditorshipHasResearchAreaIterator.class);
			pageContext.getOut().print(theEditorshipHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

