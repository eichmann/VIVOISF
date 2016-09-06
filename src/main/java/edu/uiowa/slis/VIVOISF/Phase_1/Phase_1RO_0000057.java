package edu.uiowa.slis.VIVOISF.Phase_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_1RO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_1RO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_1RO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_1RO_0000057Iterator thePhase_1RO_0000057Iterator = (Phase_1RO_0000057Iterator)findAncestorWithClass(this, Phase_1RO_0000057Iterator.class);
			pageContext.getOut().print(thePhase_1RO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

