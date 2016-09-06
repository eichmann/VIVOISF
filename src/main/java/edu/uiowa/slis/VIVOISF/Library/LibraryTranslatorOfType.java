package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryTranslatorOfIterator theLibraryTranslatorOfIterator = (LibraryTranslatorOfIterator)findAncestorWithClass(this, LibraryTranslatorOfIterator.class);
			pageContext.getOut().print(theLibraryTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

