package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565PerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565PerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565PerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565PerformerInverseIterator theERO_0000565PerformerInverseIterator = (ERO_0000565PerformerInverseIterator)findAncestorWithClass(this, ERO_0000565PerformerInverseIterator.class);
			pageContext.getOut().print(theERO_0000565PerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for performer tag ");
		}
		return SKIP_BODY;
	}
}

