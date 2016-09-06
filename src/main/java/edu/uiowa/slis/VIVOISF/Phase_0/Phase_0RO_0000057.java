package edu.uiowa.slis.VIVOISF.Phase_0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_0RO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_0RO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_0RO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_0RO_0000057Iterator thePhase_0RO_0000057Iterator = (Phase_0RO_0000057Iterator)findAncestorWithClass(this, Phase_0RO_0000057Iterator.class);
			pageContext.getOut().print(thePhase_0RO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

