package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineEditorIterator theMagazineEditorIterator = (MagazineEditorIterator)findAncestorWithClass(this, MagazineEditorIterator.class);
			pageContext.getOut().print(theMagazineEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for editor tag ");
		}
		return SKIP_BODY;
	}
}

