package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingIsPredecessorOfIterator theNon_self_governingIsPredecessorOfIterator = (Non_self_governingIsPredecessorOfIterator)findAncestorWithClass(this, Non_self_governingIsPredecessorOfIterator.class);
			pageContext.getOut().print(theNon_self_governingIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

