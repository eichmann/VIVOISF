package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookRO_0000056Iterator theMultiVolumeBookRO_0000056Iterator = (MultiVolumeBookRO_0000056Iterator)findAncestorWithClass(this, MultiVolumeBookRO_0000056Iterator.class);
			pageContext.getOut().print(theMultiVolumeBookRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

