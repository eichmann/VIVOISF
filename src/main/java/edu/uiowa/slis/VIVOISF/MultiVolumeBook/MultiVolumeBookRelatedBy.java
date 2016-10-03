package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookRelatedByIterator theMultiVolumeBookRelatedByIterator = (MultiVolumeBookRelatedByIterator)findAncestorWithClass(this, MultiVolumeBookRelatedByIterator.class);
			pageContext.getOut().print(theMultiVolumeBookRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

