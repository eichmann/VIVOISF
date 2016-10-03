package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryEditorInverseIterator theLibraryEditorInverseIterator = (LibraryEditorInverseIterator)findAncestorWithClass(this, LibraryEditorInverseIterator.class);
			pageContext.getOut().print(theLibraryEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for editor tag ");
		}
		return SKIP_BODY;
	}
}

