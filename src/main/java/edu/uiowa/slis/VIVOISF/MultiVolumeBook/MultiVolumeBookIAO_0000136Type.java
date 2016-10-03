package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIAO_0000136Iterator theMultiVolumeBookIAO_0000136Iterator = (MultiVolumeBookIAO_0000136Iterator)findAncestorWithClass(this, MultiVolumeBookIAO_0000136Iterator.class);
			pageContext.getOut().print(theMultiVolumeBookIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

