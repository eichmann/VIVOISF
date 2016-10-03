package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryPerformerInverseIterator theLibraryPerformerInverseIterator = (LibraryPerformerInverseIterator)findAncestorWithClass(this, LibraryPerformerInverseIterator.class);
			pageContext.getOut().print(theLibraryPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for performer tag ");
		}
		return SKIP_BODY;
	}
}

