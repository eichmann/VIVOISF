package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingIsPredecessorOfIterator thenon_self_governingIsPredecessorOfIterator = (non_self_governingIsPredecessorOfIterator)findAncestorWithClass(this, non_self_governingIsPredecessorOfIterator.class);
			pageContext.getOut().print(thenon_self_governingIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

