package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryDirectorInverseIterator theLibraryDirectorInverseIterator = (LibraryDirectorInverseIterator)findAncestorWithClass(this, LibraryDirectorInverseIterator.class);
			pageContext.getOut().print(theLibraryDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for director tag ");
		}
		return SKIP_BODY;
	}
}

