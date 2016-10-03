package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryCourtInverseIterator theLibraryCourtInverseIterator = (LibraryCourtInverseIterator)findAncestorWithClass(this, LibraryCourtInverseIterator.class);
			pageContext.getOut().print(theLibraryCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for court tag ");
		}
		return SKIP_BODY;
	}
}

