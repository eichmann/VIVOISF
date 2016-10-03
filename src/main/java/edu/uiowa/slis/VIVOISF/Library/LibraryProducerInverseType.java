package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryProducerInverseIterator theLibraryProducerInverseIterator = (LibraryProducerInverseIterator)findAncestorWithClass(this, LibraryProducerInverseIterator.class);
			pageContext.getOut().print(theLibraryProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for producer tag ");
		}
		return SKIP_BODY;
	}
}

