package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionVolumeIterator theLegalDecision = (LegalDecisionVolumeIterator)findAncestorWithClass(this, LegalDecisionVolumeIterator.class);
			pageContext.getOut().print(theLegalDecision.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for volume tag ");
		}
		return SKIP_BODY;
	}
}

