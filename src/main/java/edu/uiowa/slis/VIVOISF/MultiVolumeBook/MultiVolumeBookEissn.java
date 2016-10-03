package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookEissnIterator theMultiVolumeBook = (MultiVolumeBookEissnIterator)findAncestorWithClass(this, MultiVolumeBookEissnIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for eissn tag ");
		}
		return SKIP_BODY;
	}
}

