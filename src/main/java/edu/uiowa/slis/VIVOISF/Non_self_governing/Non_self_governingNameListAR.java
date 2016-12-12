package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingNameListARIterator theNon_self_governing = (Non_self_governingNameListARIterator)findAncestorWithClass(this, Non_self_governingNameListARIterator.class);
			pageContext.getOut().print(theNon_self_governing.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

