package edu.uiowa.slis.VIVOISF.Phase_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_1BFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_1BFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_1BFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_1BFO_0000055Iterator thePhase_1BFO_0000055Iterator = (Phase_1BFO_0000055Iterator)findAncestorWithClass(this, Phase_1BFO_0000055Iterator.class);
			pageContext.getOut().print(thePhase_1BFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

