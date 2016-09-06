package edu.uiowa.slis.VIVOISF.Phase_2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_2RO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_2RO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_2RO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_2RO_0000057Iterator thePhase_2RO_0000057Iterator = (Phase_2RO_0000057Iterator)findAncestorWithClass(this, Phase_2RO_0000057Iterator.class);
			pageContext.getOut().print(thePhase_2RO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_2 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

