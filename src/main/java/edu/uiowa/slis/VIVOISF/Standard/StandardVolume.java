package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardVolumeIterator theStandard = (StandardVolumeIterator)findAncestorWithClass(this, StandardVolumeIterator.class);
			pageContext.getOut().print(theStandard.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for volume tag ");
		}
		return SKIP_BODY;
	}
}

