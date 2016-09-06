package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Volume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Volume currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Volume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272VolumeIterator theOBI_0000272 = (OBI_0000272VolumeIterator)findAncestorWithClass(this, OBI_0000272VolumeIterator.class);
			pageContext.getOut().print(theOBI_0000272.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for volume tag ");
		}
		return SKIP_BODY;
	}
}

