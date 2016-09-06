package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentVolumeIterator thePatent = (PatentVolumeIterator)findAncestorWithClass(this, PatentVolumeIterator.class);
			pageContext.getOut().print(thePatent.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for volume tag ");
		}
		return SKIP_BODY;
	}
}

