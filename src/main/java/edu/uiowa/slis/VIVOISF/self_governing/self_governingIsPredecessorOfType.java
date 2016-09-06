package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingIsPredecessorOfIterator theself_governingIsPredecessorOfIterator = (self_governingIsPredecessorOfIterator)findAncestorWithClass(this, self_governingIsPredecessorOfIterator.class);
			pageContext.getOut().print(theself_governingIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

