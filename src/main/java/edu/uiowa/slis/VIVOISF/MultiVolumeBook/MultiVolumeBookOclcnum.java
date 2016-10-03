package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookOclcnumIterator theMultiVolumeBook = (MultiVolumeBookOclcnumIterator)findAncestorWithClass(this, MultiVolumeBookOclcnumIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

