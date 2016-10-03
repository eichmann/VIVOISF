package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIdentifierIterator theMultiVolumeBook = (MultiVolumeBookIdentifierIterator)findAncestorWithClass(this, MultiVolumeBookIdentifierIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for identifier tag ");
		}
		return SKIP_BODY;
	}
}

