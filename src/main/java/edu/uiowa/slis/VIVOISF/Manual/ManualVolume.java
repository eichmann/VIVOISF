package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualVolumeIterator theManual = (ManualVolumeIterator)findAncestorWithClass(this, ManualVolumeIterator.class);
			pageContext.getOut().print(theManual.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for volume tag ");
		}
		return SKIP_BODY;
	}
}

