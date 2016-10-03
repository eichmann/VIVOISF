package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptEditorIterator theManuscriptEditorIterator = (ManuscriptEditorIterator)findAncestorWithClass(this, ManuscriptEditorIterator.class);
			pageContext.getOut().print(theManuscriptEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for editor tag ");
		}
		return SKIP_BODY;
	}
}

