package edu.uiowa.slis.VIVOISF.Phase_3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_3ERO_0001518Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_3ERO_0001518Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_3ERO_0001518Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_3ERO_0001518InverseIterator thePhase_3ERO_0001518InverseIterator = (Phase_3ERO_0001518InverseIterator)findAncestorWithClass(this, Phase_3ERO_0001518InverseIterator.class);
			pageContext.getOut().print(thePhase_3ERO_0001518InverseIterator.getERO_0001518Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_3 for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_3 for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

