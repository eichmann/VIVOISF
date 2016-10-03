package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryProducerInverseIterator theLibraryProducerInverseIterator = (LibraryProducerInverseIterator)findAncestorWithClass(this, LibraryProducerInverseIterator.class);
			pageContext.getOut().print(theLibraryProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for producer tag ");
		}
		return SKIP_BODY;
	}
}

