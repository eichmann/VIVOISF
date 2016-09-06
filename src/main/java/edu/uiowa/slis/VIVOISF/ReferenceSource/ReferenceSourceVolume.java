package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceVolumeIterator theReferenceSource = (ReferenceSourceVolumeIterator)findAncestorWithClass(this, ReferenceSourceVolumeIterator.class);
			pageContext.getOut().print(theReferenceSource.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for volume tag ");
		}
		return SKIP_BODY;
	}
}

