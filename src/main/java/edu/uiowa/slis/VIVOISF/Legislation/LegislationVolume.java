package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationVolumeIterator theLegislation = (LegislationVolumeIterator)findAncestorWithClass(this, LegislationVolumeIterator.class);
			pageContext.getOut().print(theLegislation.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for volume tag ");
		}
		return SKIP_BODY;
	}
}

