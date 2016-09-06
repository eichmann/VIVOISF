package edu.uiowa.slis.VIVOISF.Hearing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HearingBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HearingBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(HearingBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HearingBFO_0000055Iterator theHearingBFO_0000055Iterator = (HearingBFO_0000055Iterator)findAncestorWithClass(this, HearingBFO_0000055Iterator.class);
			pageContext.getOut().print(theHearingBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

