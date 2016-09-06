package edu.uiowa.slis.VIVOISF.Phase_0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_0BFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_0BFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_0BFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_0BFO_0000055Iterator thePhase_0BFO_0000055Iterator = (Phase_0BFO_0000055Iterator)findAncestorWithClass(this, Phase_0BFO_0000055Iterator.class);
			pageContext.getOut().print(thePhase_0BFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

