package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookRO_0002353Iterator theMultiVolumeBookRO_0002353Iterator = (MultiVolumeBookRO_0002353Iterator)findAncestorWithClass(this, MultiVolumeBookRO_0002353Iterator.class);
			pageContext.getOut().print(theMultiVolumeBookRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

