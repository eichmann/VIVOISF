package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			if (!theMultiVolumeBook.commitNeeded) {
				pageContext.getOut().print(theMultiVolumeBook.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			return theMultiVolumeBook.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MultiVolumeBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			theMultiVolumeBook.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for label tag ");
		}
	}
}

