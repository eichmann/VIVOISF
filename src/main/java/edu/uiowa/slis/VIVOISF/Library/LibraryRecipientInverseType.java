package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryRecipientInverseIterator theLibraryRecipientInverseIterator = (LibraryRecipientInverseIterator)findAncestorWithClass(this, LibraryRecipientInverseIterator.class);
			pageContext.getOut().print(theLibraryRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for recipient tag ");
		}
		return SKIP_BODY;
	}
}

