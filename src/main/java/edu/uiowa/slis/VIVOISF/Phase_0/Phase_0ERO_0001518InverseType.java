package edu.uiowa.slis.VIVOISF.Phase_0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_0ERO_0001518InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_0ERO_0001518InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_0ERO_0001518InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_0ERO_0001518InverseIterator thePhase_0ERO_0001518InverseIterator = (Phase_0ERO_0001518InverseIterator)findAncestorWithClass(this, Phase_0ERO_0001518InverseIterator.class);
			pageContext.getOut().print(thePhase_0ERO_0001518InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

