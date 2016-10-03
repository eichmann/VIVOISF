package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookARG_2000028Iterator theMultiVolumeBookARG_2000028Iterator = (MultiVolumeBookARG_2000028Iterator)findAncestorWithClass(this, MultiVolumeBookARG_2000028Iterator.class);
			pageContext.getOut().print(theMultiVolumeBookARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

