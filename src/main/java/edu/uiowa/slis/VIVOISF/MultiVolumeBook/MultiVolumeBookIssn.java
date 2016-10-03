package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIssnIterator theMultiVolumeBook = (MultiVolumeBookIssnIterator)findAncestorWithClass(this, MultiVolumeBookIssnIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for issn tag ");
		}
		return SKIP_BODY;
	}
}

