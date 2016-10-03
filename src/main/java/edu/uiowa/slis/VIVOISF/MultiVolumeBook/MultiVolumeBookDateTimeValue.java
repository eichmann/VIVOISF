package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookDateTimeValueIterator theMultiVolumeBookDateTimeValueIterator = (MultiVolumeBookDateTimeValueIterator)findAncestorWithClass(this, MultiVolumeBookDateTimeValueIterator.class);
			pageContext.getOut().print(theMultiVolumeBookDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

