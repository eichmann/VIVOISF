package edu.uiowa.slis.VIVOISF.Hearing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HearingRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HearingRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(HearingRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HearingRO_0000057Iterator theHearingRO_0000057Iterator = (HearingRO_0000057Iterator)findAncestorWithClass(this, HearingRO_0000057Iterator.class);
			pageContext.getOut().print(theHearingRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

