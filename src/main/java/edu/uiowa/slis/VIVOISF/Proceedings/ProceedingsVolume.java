package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsVolumeIterator theProceedings = (ProceedingsVolumeIterator)findAncestorWithClass(this, ProceedingsVolumeIterator.class);
			pageContext.getOut().print(theProceedings.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for volume tag ");
		}
		return SKIP_BODY;
	}
}

